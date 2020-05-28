package com.example.accessingdata.jpademo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntryDto {
    private int id;

    private String type;

    private String rank;

    public EntryDto(Entry entity) {
        this.id = entity.getId();
        this.type = entity.getType();
        this.rank = entity.getRank();
    }
}
