package mvc_film.repository;

import mvc_film.model.Film;

import java.util.List;

public interface IFilmRepository {
    public void create(Film film);

    List<Film> getAllFilm();

    void delete(String id);

    void edit(Film film);
    List<Film> searchByName(String name);
     void sortByPrice();
}
