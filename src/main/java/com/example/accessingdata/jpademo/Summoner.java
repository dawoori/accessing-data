package com.example.accessingdata.jpademo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ToString
@Setter
@Getter
@Entity
public class Summoner {
    @GeneratedValue
    @Id
    int id;

    String name;
}
