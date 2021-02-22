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
public class Partida {
    @Id
    private String id;

    private String local;

    private String idClubeMandante;
    private String idClubeVisitante;

    private int quantidadeApostasMandante;
    private int quantidadeApostasVisitante;

    private BigDecimal saldoMandante;
    private BigDecimal saldoVisitante;
}
