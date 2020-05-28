package com.example.accessingdata.jpademo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Setter
@Getter
@Entity
public class Entry {
    @GeneratedValue
    @Id
    int id;

    String type;

    String rank;

    @ManyToOne(fetch = FetchType.LAZY)
    Summoner summoner;
}
