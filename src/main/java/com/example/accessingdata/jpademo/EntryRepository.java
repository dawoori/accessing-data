package com.example.accessingdata.jpademo;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Integer> {
    Entry findByRank(String rank);

    @EntityGraph("EntryWithSummoner")
    List<Entry> findAll();
}
