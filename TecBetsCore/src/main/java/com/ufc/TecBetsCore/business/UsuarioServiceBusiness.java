package com.ufc.TecBetsCore.business;

import com.ufc.TecBetsCore.model.Usuario;
import com.ufc.TecBetsCore.repository.UsuarioRepository;
import com.ufc.TecBetsCore.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceBusiness implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> obterTodos() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario obterPorId(String id) {
        return this.usuarioRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuario não existe."));
    }

    @Override
    public Usuario criarUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public Usuario removerPeloId(String id){
        Usuario usuarioDeletado = this.usuarioRepository.findById(id)
                                    .orElseThrow(() -> new IllegalArgumentException("Usuario não existe."));
        this.usuarioRepository.deleteById(id);
        return usuarioDeletado;
    }
}
