package com.ufc.TecBetsCore.controller;

import com.ufc.TecBetsCore.model.Aposta;
import com.ufc.TecBetsCore.service.ApostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apostas")
public class ApostaController {

    @Autowired
    private ApostaService apostaService;

    @GetMapping
    public List<Aposta> obterTodos(){
        return this.apostaService.obterTodos();
    }
    @GetMapping("/{id}")
    public Aposta obterPorId(@PathVariable String id){
        return this.apostaService.obterPorId(id);
    }
    @PostMapping("/adicionaAposta")
    public Aposta criarAposta(@RequestBody Aposta aposta){
        return this.apostaService.criarAposta(aposta);
    }
    @DeleteMapping("/removeAposta/{id}")
    public Aposta removerPeloId(@PathVariable String id) { return this.apostaService.removerPeloId(id);}
}
