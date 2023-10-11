package mvc_film.service.impl;

import mvc_film.model.Film;
import mvc_film.repository.IFilmRepository;
import mvc_film.repository.Impl.FilmRepositoryImpl;
import mvc_film.service.IFilmService;

import java.util.List;

public class FilmServiceImpl implements IFilmService {
    private final IFilmRepository filmRepository = new FilmRepositoryImpl();

    @Override
    public void create(Film film) {
        filmRepository.create(film);
    }

    @Override
    public List<Film> getAllFilm() {
        return filmRepository.getAllFilm();
    }

    @Override
    public void delete(String id) {
        filmRepository.delete(id);
    }

    @Override
    public void edit(Film film) {
        filmRepository.edit(film);
    }

    @Override
    public List<Film> searchByName(String name) {
        return filmRepository.searchByName(name);
    }

    @Override
    public void sortByPrice() {
        filmRepository.sortByPrice();
    }
}
