package com.harshith.journalManagement.controller;

import com.harshith.journalManagement.entity.Journal;
import com.harshith.journalManagement.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/journals")
public class JournalController {
    @Autowired
    private JournalService journalService;

    @GetMapping
    public List<Journal> getAllJournals() {
        return journalService.getAllJournals();
    }
}
