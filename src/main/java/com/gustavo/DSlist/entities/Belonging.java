package com.gustavo.DSlist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId // Indica que a chave primária é composta e está definida na classe BelongingPK
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging() {}

    public Belonging(Game game,GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }
}
