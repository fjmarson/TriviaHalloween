package TriviaHalloween.repository;

import TriviaHalloween.model.Dificultad;
import TriviaHalloween.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {

    List<Pregunta> findByDificultad(Dificultad dificultad);
}
