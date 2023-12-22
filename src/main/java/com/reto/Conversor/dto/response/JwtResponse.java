package com.reto.Conversor.dto.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class JwtResponse {
    private String token;
    private String type = "Bearer";
}
