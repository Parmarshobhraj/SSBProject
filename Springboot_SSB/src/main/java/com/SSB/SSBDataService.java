package com.SSB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSBDataService {
    @Autowired
    private SSBRecordRepository repository;

    public void parseAndSaveData(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<SSBRecord> batch = new ArrayList()<>();
            String line;
            while ((line = reader.readLine()) != null) {
                SSBRecord record = parseLine(line);
                batch.add(record);
                if (batch.size() == 1000) {
                    repository.saveAll(batch);
                    batch.clear();
                }
            }
            if (!batch.isEmpty()) {
                repository.saveAll(batch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private SSBRecord parseLine(String line) {
        String[] fields = line.split(",");
        SSBRecord record = new SSBRecord();
        record.setEventID(fields[0]);
        record.setDatetime(Timestamp.valueOf(fields[1]));
        record.setLatitude(Double.valueOf(fields[2]));
        record.setLongitude(Double.valueOf(fields[3]));
        record.setMagnitude(Double.valueOf(fields[4]));
        record.setMagType(fields[5]);
        return record;
    }
}
