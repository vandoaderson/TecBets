package com.ufc.TecBetsCore.controller;

import com.ufc.TecBetsCore.model.Aposta;
import com.ufc.TecBetsCore.model.Clube;
import com.ufc.TecBetsCore.service.ClubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubes")
public class ClubeController {

    @Autowired
    private ClubeService clubeService;

    @GetMapping
    public List<Clube> obterTodos(){
        return this.clubeService.obterTodos();
    }
    @GetMapping("/{id}")
    public Clube obterPorId(@PathVariable String id){
        return this.clubeService.obterPorId(id);
    }
    @PostMapping("/adicionaClube")
    public Clube criar(@RequestBody Clube clube){
        return this.clubeService.criar(clube);
    }
    @DeleteMapping("/removeClube/{id}")
    public Clube removerPeloId(@PathVariable String id) { return this.clubeService.removerPeloId(id);}
}
