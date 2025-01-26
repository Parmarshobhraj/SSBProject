package com.SSB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SSBRecordRepository extends JpaRepository<SSBRecord, String>{

}
