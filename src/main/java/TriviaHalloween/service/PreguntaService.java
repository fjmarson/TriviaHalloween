package TriviaHalloween.service;

import TriviaHalloween.model.Dificultad;
import TriviaHalloween.model.Pregunta;
import TriviaHalloween.repository.PreguntaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    public Pregunta agregarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    public List<Pregunta> listarPreguntas() {
        return preguntaRepository.findAll();
    }

    public Optional<Pregunta> obtenerPreguntaPorId(Long id) {
        return preguntaRepository.findById(id);
    }

    public List<Pregunta> obtenerPreguntasPorDificultad(Dificultad dificultad) {
        List<Pregunta> preguntas = preguntaRepository.findByDificultad(dificultad);
        Collections.shuffle(preguntas); // Mezcla para que sea aleatorio
        return preguntas;
    }

    public Pregunta actualizarPregunta(Long id, Pregunta nuevaPregunta) {
        return preguntaRepository.findById(id)
                .map(pregunta -> {
                    pregunta.setPregunta(nuevaPregunta.getPregunta());
                    pregunta.setRespuesta(nuevaPregunta.getRespuesta());
                    pregunta.setDificultad(nuevaPregunta.getDificultad());
                    return preguntaRepository.save(pregunta);
                })
                .orElseThrow(() -> new EntityNotFoundException("Pregunta no encontrada"));
    }
}
