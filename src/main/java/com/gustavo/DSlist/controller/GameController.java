package com.gustavo.DSlist.controller;

import com.gustavo.DSlist.dto.GameMinDto;
import com.gustavo.DSlist.entities.Game;
import com.gustavo.DSlist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/games")
@RestController
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDto> listar(){
        List<GameMinDto> resultado = service.lista();
        return resultado;
    }
}
