package com.harshith.journalManagement.repository;

import com.harshith.journalManagement.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {
}
