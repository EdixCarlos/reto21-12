# Conversor de Monedas API con Spring Boot

Este proyecto es una API RESTful desarrollada con Spring Boot para la conversión de monedas. Permite a los usuarios convertir montos de una moneda a otra y actualizar los tipos de cambio.

## Descripción General

El proyecto ofrece las siguientes funcionalidades:
- **Conversión de Monedas**: Convierte un monto de una moneda de origen a una moneda de destino.
- **Actualización de Tipo de Cambio**: Permite actualizar el tipo de cambio entre dos monedas.

Tecnologías utilizadas:
- Spring Boot 3
- Spring Data JPA
- H2 Database

## Instalación y Ejecución

Sigue estos pasos para instalar y ejecutar el proyecto:

1. Clona el repositorio: `git clone https://github.com/EdixCarlos/reto21-12`
2. Navega al directorio del proyecto: `cd reto21-12`
3. Construye el proyecto con Maven: `mvn clean install`
4. Ejecuta el proyecto: `mvn spring-boot:run`

O estos para usar docker:
1. docker build -t reto-app .
2. docker run -p 8080:8080 reto-app


## Uso de la API

### Convertir Moneda

- **Endpoint**: `POST /api/convertir`
- **RequestBody**:
  ```json
  {
      "monto": 100.00,
      "monedaOrigen": "USD",
      "monedaDestino": "EUR"
  }
- **Response**:
  ```json
  {
    "monto": 100.00,
    "monedaOrigen": "USD",
    "monedaDestino": "EUR",
    "montoConTipoDeCambio": 85.00,
    "tipoDeCambio": 0.85
}

### Actualizar Tipo de Cambio

- **Endpoint**: `POST /api/actualizar-tipo-cambio`
- **RequestBody**:
  ```json
  {
    "monedaOrigen": "USD",
    "monedaDestino": "EUR",
    "tipoDeCambio": 0.90
  }
- **Response**:
  ```json
  {
    "monedaOrigen": "USD",
    "monedaDestino": "EUR",
    "tipoDeCambio": 0.90
  }
### Pruebas
- **Url**: `http://localhost:8080`