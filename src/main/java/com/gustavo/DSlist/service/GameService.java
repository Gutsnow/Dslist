package com.gustavo.DSlist.service;

import com.gustavo.DSlist.dto.GameDto;
import com.gustavo.DSlist.dto.GameMinDto;
import com.gustavo.DSlist.entities.Game;
import com.gustavo.DSlist.projection.GameMinprojection;
import com.gustavo.DSlist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;


    public GameDto listarPorId(Long id) {
        Game result = gameRepository.findById(id).get();
        GameDto dto = new GameDto(result);
        return dto;
    }

    public List<GameMinDto> lista() {
        List<Game> resul = gameRepository.findAll();
        List<GameMinDto> result = resul.stream().map(x -> new GameMinDto(x)).toList(); // essa linha converte o Game do banco para a classe DTO
        return result;
    }

    public List<GameMinDto> findByList(Long listId) {
        List<GameMinprojection> resul = gameRepository.pesquisarPorLista(listId);
        List<GameMinDto> result = resul.stream().map(x -> new GameMinDto(x)).toList(); // essa linha converte o Game do banco para a classe DTO
        return result;
    }
}
