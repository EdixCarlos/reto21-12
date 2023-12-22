package com.reto.Conversor;

import com.reto.Conversor.model.TipoCambio;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {
    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    @PostConstruct
    public void initData() {
        TipoCambio tc1 = new TipoCambio();
        tc1.setId("USD_EUR");
        tc1.setMonedaOrigen("USD");
        tc1.setMonedaDestino("EUR");
        tc1.setTipoDeCambio(0.85); // Asume un tipo de cambio hipotético
        tipoCambioRepository.save(tc1);

    }
}
