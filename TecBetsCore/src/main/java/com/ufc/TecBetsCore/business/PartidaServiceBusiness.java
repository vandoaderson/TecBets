package com.ufc.TecBetsCore.business;

import com.ufc.TecBetsCore.model.Partida;
import com.ufc.TecBetsCore.repository.PartidaRepository;
import com.ufc.TecBetsCore.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaServiceBusiness implements PartidaService {

    @Autowired
    private PartidaRepository partidaRepository;

    @Override
    public List<Partida> obterTodos() {
        return this.partidaRepository.findAll();
    }

    @Override
    public Partida obterPorId(String id) {
        return this.partidaRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Partida não existe."));
    }

    @Override
    public Partida criar(Partida partida) {
        return this.partidaRepository.save(partida);
    }

    @Override
    public Partida removerPeloId(String id) {
        Partida partidaDeletada = this.partidaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Partida não existe."));
        this.partidaRepository.deleteById(id);
        return partidaDeletada;
    }
}
