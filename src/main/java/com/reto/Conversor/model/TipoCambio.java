package com.reto.Conversor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tipo_cambio")
@Data
public class TipoCambio implements Serializable {

    @Id
    private String id; // Un identificador único, por ejemplo, "USD_EUR" para el tipo de cambio de USD a EUR

    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoDeCambio;

    // Getters, setters y constructor
}