package com.example.accessingdata.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Integer> {
    public Entry findByRank(String rank);
}
