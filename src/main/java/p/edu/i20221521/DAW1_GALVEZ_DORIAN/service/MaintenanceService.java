package p.edu.i20221521.DAW1_GALVEZ_DORIAN.service;

import p.edu.i20221521.DAW1_GALVEZ_DORIAN.dto.FilmDetailDto;
import p.edu.i20221521.DAW1_GALVEZ_DORIAN.dto.FilmDto;
import p.edu.i20221521.DAW1_GALVEZ_DORIAN.dto.FilmRegisterDto;
import p.edu.i20221521.DAW1_GALVEZ_DORIAN.dto.FilmUpdateDto;
import p.edu.i20221521.DAW1_GALVEZ_DORIAN.entity.Language;

import java.util.List;

public interface MaintenanceService {
    List<FilmDto> getAllFilms();

    FilmDetailDto getFilmById(int id);

    FilmUpdateDto getFilmUpdateById(int id);

    void updateFilm(FilmUpdateDto filmUpdateDto);

    void deleteFilm(int id);

    void registerNewFilm(FilmRegisterDto filmRegisterDto);

    List<Language> getAllLanguages();
}
