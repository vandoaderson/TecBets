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
    @Id
    private String id;

    private String idUsuario;
    private String idPartida;
    private String idClube;
    private BigDecimal valorAposta;
}
