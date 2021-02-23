package com.ufc.TecBetsCore.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@Data
@Document
public class Aposta {

    public Aposta(String id, String idUsuario, String idPartida, String idClube, double valorAposta) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idPartida = idPartida;
        this.idClube = idClube;
        this.valorAposta = valorAposta;
    }

    @Id
    private String id;

    private String idUsuario;
    private String idPartida;
    private String idClube;
    private double valorAposta;
}
