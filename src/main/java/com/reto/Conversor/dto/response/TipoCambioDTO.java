package com.reto.Conversor.dto.response;

import lombok.Data;

@Data
public class TipoCambioDTO {
    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoDeCambio;
}
