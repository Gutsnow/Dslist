package com.gustavo.DSlist.service;

import com.gustavo.DSlist.dto.GameMinDto;
import com.gustavo.DSlist.entities.Game;
import com.gustavo.DSlist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> lista(){
       List<Game> resul = gameRepository.findAll();
       List<GameMinDto> result = resul.stream().map(x -> new GameMinDto(x)).toList(); // essa linha converte o Game do banco para a classe DTO
        return result;
    }
}
