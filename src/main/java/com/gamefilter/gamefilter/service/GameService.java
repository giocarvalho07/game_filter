package com.gamefilter.gamefilter.service;

import com.gamefilter.gamefilter.dto.GameDTO;
import com.gamefilter.gamefilter.entities.Game;
import com.gamefilter.gamefilter.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    //garantir que as conexões com banco de dados sejam realizadas apenas no service
    public List< GameDTO > findAll(){
        List< Game > list = gameRepository.findAll();
        return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
        //tranforma o objeto em stream, converte em ecom o lambada em chave valor e depois converte novamente em lista
    }
}
