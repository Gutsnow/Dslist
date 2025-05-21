package com.gustavo.DSlist.controller;

import com.gustavo.DSlist.dto.GameListDto;
import com.gustavo.DSlist.dto.GameMinDto;
import com.gustavo.DSlist.entities.GameList;
import com.gustavo.DSlist.service.GameListService;
import com.gustavo.DSlist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    GameListService service;
    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDto> listar(){
        return service.listarListas();
    }

    @GetMapping("/{id}")
    public GameListDto listarPorId(@PathVariable Long id){
        return service.listarListasPeloId(id);
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId){
        List<GameMinDto> re = gameService.findByList(listId);
        return re;
    }
}
