package com.ufc.TecBetsCore.service;

import com.ufc.TecBetsCore.model.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> obterTodos();

    public Usuario obterPorId(String id);

    public Usuario criar(Usuario usuario);
}
