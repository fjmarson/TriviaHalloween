# 🎃 Halloween Trivia API 🎃

Esta es una API RESTful desarrollada en Java 17 y Spring Boot para un juego de trivia temática de Halloween. La API permite gestionar preguntas y respuestas sobre mitos y leyendas de Halloween, con funcionalidades para agregar, listar y actualizar preguntas, y ofrecer una lista aleatoria de preguntas según el nivel de dificultad.

## Características

- **Gestión de Preguntas**: Endpoints para agregar, listar y actualizar preguntas de trivia.
- **Niveles de Dificultad**: Las preguntas incluyen un nivel de dificultad (`fácil`, `medio`, `difícil`).
- **Trivia Aleatoria**: Los usuarios pueden obtener una lista de preguntas aleatorias de acuerdo al nivel de dificultad.
- **Documentación**: API documentada con Swagger/OpenAPI.

## Requisitos Previos

- **Java 17**
- **Spring Boot**
- **Maven** (para la gestión de dependencias)
- **Base de Datos** (Ej: H2 en memoria para pruebas o MySQL/PostgreSQL para producción)

## Instalación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/halloween-trivia-api.git
   cd halloween-trivia-api

2. Configura el archivo application.properties con los datos de tu base de datos y las variables de entorno.

3. Ejecuta el proyecto:

    ./mvnw spring-boot:run

4. Accede a la documentación de la API en http://localhost:8080/swagger-ui.html o en el endpoint configurado.

## Endpoints

![swagger](https://github.com/fjmarson/TriviaHalloween/blob/main/src/main/resources/images/Swagger.png?raw=true)

## Gestión de Preguntas

    POST /api/preguntas - Añadir una nueva pregunta
    GET /api/preguntas - Listar todas las preguntas
    PUT /api/preguntas/{id} - Actualizar una pregunta existente
    DELETE /api/preguntas/{id} - Eliminar una pregunta existente

## Trivia Aleatoria

    GET /api/preguntas/random/{dificultad} - Obtener una lista aleatoria de preguntas según la dificultad (fácil, medio, difícil)

## Estructura de las Preguntas

**Cada pregunta incluye los siguientes campos:**

    id: Identificador único de la pregunta.
    texto: Texto de la pregunta.
    respuesta: Respuesta correcta de la pregunta.
    dificultad: Nivel de dificultad (fácil, medio, difícil).

## Ejemplo de Uso

**Agregar una Pregunta**
POST /api/preguntas
Content-Type: application/json

{
  "texto": "¿Qué criatura es conocida por su habilidad para convertirse en niebla?",
  "respuesta": "Vampiro",
  "dificultad": "medio"
}

**Obtener Preguntas Aleatorias por Dificultad**
GET /api/preguntas/random/medio

## Documentación de la API

**La API está documentada con Swagger. Puedes acceder a la documentación completa en:**

    Swagger UI: http://localhost:8080/swagger-ui.html
    OpenAPI Spec: http://localhost:8080/v3/api-docs

## Tecnologías Utilizadas

    Java 17
    Spring Boot
    Swagger / OpenAPI para la documentación de la API
    Maven

## Contribución

Si deseas contribuir, por favor abre un pull request o reporta problemas en la sección de issues.

🎃 ¡Disfruta creando y jugando con la Trivia de Halloween! 👻

