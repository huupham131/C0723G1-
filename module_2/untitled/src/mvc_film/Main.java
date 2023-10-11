package mvc_film;

import mvc_film.view.FilmManagerView;


public class Main {
    public static void main(String[] args) {
        FilmManagerView filmManagerView = new FilmManagerView();
        filmManagerView.render();
    }
}
