package com.reto.Conversor.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "tipo_cambio")
@Data
public class ConversionDTO {
    @Id
    private String id;
    private Double monto;
    private String monedaOrigen;
    private String monedaDestino;
    private Double montoConTipoDeCambio;
    private Double tipoDeCambio;
}
