package com.ufc.TecBetsCore.business;

import com.ufc.TecBetsCore.model.Clube;
import com.ufc.TecBetsCore.repository.ClubeRepository;
import com.ufc.TecBetsCore.service.ClubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubeServiceBusiness implements ClubeService {

    @Autowired
    private ClubeRepository clubeRepository;

    @Override
    public List<Clube> obterTodos() {
        return this.clubeRepository.findAll();
    }

    @Override
    public Clube obterPorId(String id) {
        return this.clubeRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Clube não existe."));
    }

    @Override
    public Clube criarClube(Clube clube) {
        return this.clubeRepository.save(clube);
    }

    @Override
    public Clube removerPeloId(String id) {
        Clube clubeDeletado = this.clubeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Clube não existe."));
        this.clubeRepository.deleteById(id);
        return clubeDeletado;
    }
}
