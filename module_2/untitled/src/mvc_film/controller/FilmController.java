package mvc_film.controller;

import mvc_film.model.Film;
import mvc_film.service.IFilmService;
import mvc_film.service.impl.FilmServiceImpl;

import java.util.List;

public class FilmController {
    private final IFilmService filmService = new FilmServiceImpl();

    public void create(Film film) {
        filmService.create(film);
    }

    public List<Film> getAllFilm() {
        return filmService.getAllFilm();
    }

    public void delete(String id) {
        filmService.delete(id);
    }

    public void edit(Film film) {
        filmService.edit(film);
    }
    public List<Film> searchByName(String name){
        return filmService.searchByName(name);
    }
    public void sortByPrice(){
        filmService.sortByPrice();
    }
}
