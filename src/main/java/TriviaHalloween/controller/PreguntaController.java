package TriviaHalloween.controller;

import TriviaHalloween.model.Dificultad;
import TriviaHalloween.model.Pregunta;
import TriviaHalloween.service.PreguntaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/preguntas")
@Tag(name = "Trivia de Halloween", description = "Gestión de preguntas de trivia para Halloween")
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    @Operation(summary = "Añadir una nueva pregunta")
    @PostMapping
    public ResponseEntity<Pregunta> agregarPregunta(@RequestBody Pregunta pregunta) {
        return ResponseEntity.ok(preguntaService.agregarPregunta(pregunta));
    }

    @Operation(summary = "Listar todas las preguntas")
    @GetMapping
    public List<Pregunta> listarPreguntas() {
        return preguntaService.listarPreguntas();
    }

    @Operation(summary = "Obtener preguntas aleatorias por nivel de dificultad")
    @GetMapping("/dificultad/{nivel}")
    public List<Pregunta> obtenerPreguntasPorDificultad(@PathVariable Dificultad nivel) {
        return preguntaService.obtenerPreguntasPorDificultad(nivel);
    }

    @Operation(summary = "Actualizar una pregunta")
    @PutMapping("/{id}")
    public ResponseEntity<Pregunta> actualizarPregunta(
            @PathVariable Long id,
            @RequestBody Pregunta pregunta) {
        return ResponseEntity.ok(preguntaService.actualizarPregunta(id, pregunta));
    }
}
