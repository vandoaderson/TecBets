package com.ufc.TecBetsCore.service;

import com.ufc.TecBetsCore.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> obterTodos();

    Usuario obterPorId(String id);

    Usuario criar(Usuario usuario);

    Usuario removerPeloId(String id);

}
