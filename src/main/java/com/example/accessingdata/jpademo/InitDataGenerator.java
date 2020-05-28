package com.example.accessingdata.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDataGenerator implements ApplicationRunner {
    @Autowired
    EntryRepository entryRepository;

    @Autowired
    SummonerRepository summonerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Summoner ral = creatSummoner("랄");
        Summoner park = creatSummoner("팤");

        creatEntry("solo", "dia", ral);
        creatEntry("solo", "plat", park);
    }

    private Summoner creatSummoner(String name) {
        Summoner summoner = summonerRepository.findByName(name);
        if (summoner == null) {
            summoner = new Summoner();
            summoner.setName(name);
        }

        return summonerRepository.save(summoner);
    }

    private Entry creatEntry(String type, String rank, Summoner summoner) {
        Entry entry = entryRepository.findByRank(rank);
        if (entry == null) {
            entry = new Entry();
            entry.setType(type);
            entry.setRank(rank);
            entry.setSummoner(summoner);
        }

        return entryRepository.save(entry);
    }
}
