package com.gustavo.DSlist.service;

import com.gustavo.DSlist.dto.GameListDto;
import com.gustavo.DSlist.entities.GameList;
import com.gustavo.DSlist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository repository;

    public List<GameListDto> listarListas(){
        return repository.findAll().stream().map(x -> new GameListDto(x)).toList();
    }

    public GameListDto listarListasPeloId(Long id){
        GameList gameList = repository.findById(id).get();
        return new GameListDto(gameList);
    }
}
