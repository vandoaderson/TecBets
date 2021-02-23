package com.ufc.TecBetsCore.controller;

import com.ufc.TecBetsCore.model.Usuario;
import com.ufc.TecBetsCore.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> obterTodos(){
        return this.usuarioService.obterTodos();
    }
    @GetMapping("/{id}")
    public Usuario obterPorId(@PathVariable String id){
        return this.usuarioService.obterPorId(id);
    }
    @PostMapping("/adicionaUsuario")
    public Usuario criar(@RequestBody Usuario usuario){
        return this.usuarioService.criarUsuario(usuario);
    }
    @DeleteMapping("/removeUsuario/{id}")
    public Usuario removerPeloId(@PathVariable String id) { return this.usuarioService.removerPeloId(id);}
}
