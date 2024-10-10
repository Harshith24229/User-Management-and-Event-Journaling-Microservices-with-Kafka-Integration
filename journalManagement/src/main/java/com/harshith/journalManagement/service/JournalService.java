package com.harshith.journalManagement.service;

import com.harshith.journalManagement.entity.Journal;

import java.util.List;

public interface JournalService {
    void consumeEvent(String message);
    List<Journal> getAllJournals();
}
