package com.reto.Conversor;

import com.reto.Conversor.dto.response.ConversionDTO;
import com.reto.Conversor.dto.response.TipoCambioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConversorMonedasController {

    @Autowired
    private ConversorMonedasService conversorMonedasService;

    @PostMapping("/convertir")
    public ResponseEntity<ConversionDTO> convertirMoneda(@RequestBody ConversionDTO conversionDTO) {
        ConversionDTO resultado = conversorMonedasService.convertir(conversionDTO);
        return ResponseEntity.ok(resultado);
    }

    @PostMapping("/actualizar-tipo-cambio")
    public ResponseEntity<TipoCambioDTO> actualizarTipoCambio(@RequestBody TipoCambioDTO tipoCambioDTO) {
        TipoCambioDTO resultado = conversorMonedasService.actualizarTipoCambio(tipoCambioDTO);
        return ResponseEntity.ok(resultado);
    }
}