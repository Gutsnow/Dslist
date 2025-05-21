package com.gustavo.DSlist.dto;

import com.gustavo.DSlist.entities.GameList;

public class GameListDto {
    private Long id;
    private String name;

    public GameListDto() {}

    public GameListDto(GameList list) {
        id = list.getId();
        name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
