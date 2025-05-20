package com.gustavo.DSlist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne //Indica que MUITOS objetos dessa entidade estão ligados a UM objeto de outra entidade.
    @JoinColumn(name = "game_id") // ESSE COMANDO CRIA UMA COLUNA COM ESSE NOME NA TABELA ATUAL
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id") // ESSE COMANDO CRIA UMA COLUNA COM ESSE NOME NA TABELA ATUAL
    private  GameList list;

//    --------------------------------------------

    public BelongingPK() {}

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
