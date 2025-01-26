package com.SSB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/SSB")
public class SSBController {
	    @Autowired
	    private SSBRecordRepository repository;

	    @GetMapping("/{eventID}")
	    public ResponseEntity<SSBRecord> getRecordByEventID(@PathVariable String eventID) {
	        return repository.findById(eventID)
	                         .map(ResponseEntity::ok)
	                         .orElse(ResponseEntity.notFound().build());
	    }
	}


