package mvc_film.service;

import mvc_film.model.Film;

import java.util.List;

public interface IFilmService {
    void create(Film film);

    List<Film> getAllFilm();

    void delete(String id);

    void edit(Film film);
    List<Film> searchByName(String name);
    void sortByPrice();
}
