package com.harshith.journalManagement.serviceimpl;

import com.harshith.journalManagement.entity.Journal;
import com.harshith.journalManagement.repository.JournalRepository;
import com.harshith.journalManagement.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class JournalServiceImpl implements JournalService {
        @Autowired
        private JournalRepository journalRepository;

        @KafkaListener(topics = "user-events", groupId = "user_group")
        @Override
        public void consumeEvent(String message) {
            Journal journal = new Journal();
            journal.setMessage(message);
            journalRepository.save(journal);
        }

        @Override
        public List<Journal> getAllJournals() {
            return journalRepository.findAll();
        }
    }

