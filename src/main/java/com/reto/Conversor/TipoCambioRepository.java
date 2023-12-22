package com.reto.Conversor;
import com.reto.Conversor.model.TipoCambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCambioRepository extends JpaRepository<TipoCambio, String> {
    TipoCambio findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);
}