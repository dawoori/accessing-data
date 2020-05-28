package com.example.accessingdata.jpademo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EntryRepositoryTest {
    @Autowired
    EntryRepository entryRepository;

    @Autowired
    SummonerRepository summonerRepository;

    @Test
    public void testSelector() {
        Summoner summoner1 = new Summoner();
        summoner1.setName("랄");
        Summoner savedSummoner1 = summonerRepository.save(summoner1);

        Summoner summoner2 = new Summoner();
        summoner2.setName("팤");
        Summoner savedSummoner2 = summonerRepository.save(summoner2);


    }
}