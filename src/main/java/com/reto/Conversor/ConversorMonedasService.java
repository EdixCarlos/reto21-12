package com.reto.Conversor;

import com.reto.Conversor.dto.response.ConversionDTO;
import com.reto.Conversor.dto.response.TipoCambioDTO;
import com.reto.Conversor.model.TipoCambio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversorMonedasService {

    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    public ConversionDTO convertir(ConversionDTO conversionDTO) {
        TipoCambio tipoCambio = tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(
                conversionDTO.getMonedaOrigen(), conversionDTO.getMonedaDestino());

        if (tipoCambio != null) {
            double montoConvertido = conversionDTO.getMonto() * tipoCambio.getTipoDeCambio();
            conversionDTO.setMontoConTipoDeCambio(montoConvertido);
            conversionDTO.setTipoDeCambio(tipoCambio.getTipoDeCambio());
        }
        return conversionDTO;
    }

    public TipoCambioDTO actualizarTipoCambio(TipoCambioDTO tipoCambioDTO) {
        TipoCambio tipoCambio = tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(
                tipoCambioDTO.getMonedaOrigen(), tipoCambioDTO.getMonedaDestino());

        if (tipoCambio == null) {
            tipoCambio = new TipoCambio();
            tipoCambio.setId(tipoCambioDTO.getMonedaOrigen() + "_" + tipoCambioDTO.getMonedaDestino());
            tipoCambio.setMonedaOrigen(tipoCambioDTO.getMonedaOrigen());
            tipoCambio.setMonedaDestino(tipoCambioDTO.getMonedaDestino());
        }

        tipoCambio.setTipoDeCambio(tipoCambioDTO.getTipoDeCambio());
        tipoCambioRepository.save(tipoCambio);

        return tipoCambioDTO;
    }
}
