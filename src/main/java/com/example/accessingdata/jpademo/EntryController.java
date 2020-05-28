package com.example.accessingdata.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

//TODO SQL 쿼리 한번에 SELECT 하기. Entry. Entry-Summoner.
@RestController
public class EntryController {
    @Autowired
    EntryRepository entryRepository;

    @GetMapping("/entrydto")
    public List<EntryDto> getEntryDtos() {
        return entryRepository.findAll().stream().
                map(EntryDto::new).collect(Collectors.toList());
    }

    @GetMapping("/entry")
    public List<Entry> getEntries() {
        return entryRepository.findAll();
    }
}
