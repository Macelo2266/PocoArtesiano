# Projeto Poços Artesianos

Este projeto é uma API REST em **Spring Boot** para gerenciar poços artesianos, permitindo cadastrar, listar e filtrar fontes de água.

## Funcionalidades

- **Cadastrar poços** via JSON.
- **Listar todos os poços**.
- **Buscar poço por ID**.
- **Filtrar poços por município**.
- **Importar poços de teste**.

## Endpoints

| Método | URL | Descrição |
|--------|-----|-----------|
| GET    | /api/fontes | Lista todos os poços |
| GET    | /api/fontes/{id} | Busca poço pelo ID |
| GET    | /api/fontes?municipio={nome} | Filtra poços por município |
| POST   | /api/fontes | Cria novo poço (JSON) |
| POST   | /api/fontes/importar | Cria poços de teste |

## Exemplo de JSON para cadastrar um poço

```json
{
  "nome": "Poço de Carão",
  "tipo": "Poço Artesiano",
  "latitude": -7.123,
  "longitude": -38.456,
  "capacidadeLitros": 50000,
  "municipio": "Olho d'Água - PB",
  "statusFonte": "ATIVA",
  "externalId": "2"
}
