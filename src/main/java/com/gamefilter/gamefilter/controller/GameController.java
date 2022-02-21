package com.gamefilter.gamefilter.controller;

import com.gamefilter.gamefilter.dto.GameDTO;
import com.gamefilter.gamefilter.entities.Game;
import com.gamefilter.gamefilter.repositories.GameRepository;
import com.gamefilter.gamefilter.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity< List< GameDTO > > findAll(){
        List<GameDTO> list = gameService.findAll();
        return ResponseEntity.ok().body(list);
    }

}
