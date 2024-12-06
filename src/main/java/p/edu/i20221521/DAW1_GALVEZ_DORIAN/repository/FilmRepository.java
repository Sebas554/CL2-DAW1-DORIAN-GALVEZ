package p.edu.i20221521.DAW1_GALVEZ_DORIAN.repository;

import org.springframework.data.repository.CrudRepository;
import p.edu.i20221521.DAW1_GALVEZ_DORIAN.entity.Film;

public interface FilmRepository extends CrudRepository<Film, Integer> {
}
