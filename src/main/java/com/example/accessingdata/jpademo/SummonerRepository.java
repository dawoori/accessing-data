package com.example.accessingdata.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SummonerRepository extends JpaRepository<Summoner, Integer> {
    public Summoner findByName(String name);
}
