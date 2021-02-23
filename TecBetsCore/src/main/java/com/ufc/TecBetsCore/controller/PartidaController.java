package com.ufc.TecBetsCore.controller;

import com.ufc.TecBetsCore.model.Partida;
import com.ufc.TecBetsCore.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @GetMapping
    public List<Partida> obterTodos(){
        return this.partidaService.obterTodos();
    }
    @GetMapping("/{id}")
    public Partida obterPorId(@PathVariable String id){
        return this.partidaService.obterPorId(id);
    }
    @PostMapping("/adicionaPartida")
    public Partida criarPartida(@RequestBody Partida partida){
        return this.partidaService.criarPartida(partida);
    }
    @DeleteMapping("/removePartida/{id}")
    public Partida removerPeloId(@PathVariable String id) { return this.partidaService.removerPeloId(id);}
}
