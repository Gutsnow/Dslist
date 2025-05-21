package com.gustavo.DSlist.controller;

import com.gustavo.DSlist.dto.GameListDto;
import com.gustavo.DSlist.entities.GameList;
import com.gustavo.DSlist.service.GameListService;
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

    @GetMapping
    public List<GameListDto> listar(){
        return service.listarListas();
    }

    @GetMapping("/{id}")
    public GameListDto listarPorId(@PathVariable Long id){
        return service.listarListasPeloId(id);
    }
}
