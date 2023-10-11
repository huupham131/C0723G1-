package mvc_film.repository.Impl;

import mvc_film.model.Film;
import mvc_film.repository.IFilmRepository;
import mvc_film.util.FileUtil;

import java.util.*;

public class FilmRepositoryImpl implements IFilmRepository {
    public static final String COMMA = ",";
    private final String FILM_PATH = "/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/mvc_film/data/Fil.csv";

    @Override
    public void create(Film film) {
        List<Film> films = new ArrayList<>();
        films.add(film);
        FileUtil.writeFile(FILM_PATH,convertObjectToString(films),true);
    }

    @Override
    public List<Film> getAllFilm() {
        return convertStringToObject(FileUtil.readFile(FILM_PATH));
    }

    @Override
    public void delete(String id) {
        List<Film> filmList = getAllFilm();
        for(Film film: filmList){
            if(film.getIdTicket().equals(id)){
                filmList.remove(film);
                FileUtil.writeFile(FILM_PATH,convertObjectToString(filmList),false);
                break;
            }
        }

    }

    @Override
    public void edit(Film film) {
        List<Film> filmList = getAllFilm();
        for (Film film1 : filmList){
            if(film1.getIdTicket().equals(film.getIdTicket())){
                film1.setNameOfFilm(film.getNameOfFilm());
                film1.setPrice(film.getPrice());
                film1.setReleaseDay(film.getReleaseDay());
            }
        }
        FileUtil.writeFile(FILM_PATH,convertObjectToString(filmList),false);
    }

    @Override
    public List<Film> searchByName(String name) {
        List<Film> films = new ArrayList<>();
        List<Film> data = getAllFilm();
        for (Film film : data){
            if(film.getNameOfFilm().contains(name)){
                films.add(film);
            }
        }
        return films;
    }

    @Override
    public void sortByPrice() {
        List<Film> filmList = getAllFilm();
        filmList.sort(new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getNameOfFilm().charAt(0)-o2.getNameOfFilm().charAt(0);
            }
        });
        System.out.println(filmList);
    }

    private List<String> convertObjectToString(List<Film> films){
        List<String> stringList = new ArrayList<>();
        for(Film film : films){
            stringList.add(film.getIdTicket()+ COMMA +film.getNameOfFilm()+COMMA+ film.getPrice()+COMMA+film.getReleaseDay());
        }
        return stringList;
   }
   private List<Film> convertStringToObject(List<String> stringList){
        List<Film> filmList = new ArrayList<>();
        String[] newArray;
        for (String string : stringList){
            newArray= string.split(",");
            filmList.add(new Film(newArray[0],newArray[1],Double.parseDouble(newArray[2]),newArray[3]));
        }
        return filmList;
   }

}
