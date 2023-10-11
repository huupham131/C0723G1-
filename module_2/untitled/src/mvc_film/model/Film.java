package mvc_film.model;

import java.util.Comparator;

public class Film implements Comparator<Film> {
    private String idTicket;
    private String nameOfFilm;
    private double price;
    private String releaseDay;
public Film(){

}
    public Film(String idTicket, String nameOfFilm, double price, String releaseDay) {
        this.idTicket = idTicket;
        this.nameOfFilm = nameOfFilm;
        this.price = price;
        this.releaseDay = releaseDay;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getNameOfFilm() {
        return nameOfFilm;
    }

    public void setNameOfFilm(String nameOfFilm) {
        this.nameOfFilm = nameOfFilm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    @Override
    public String toString() {
        return "Film{" +
                "idTicket='" + idTicket + '\'' +
                ", nameOfFilm='" + nameOfFilm + '\'' +
                ", price=" + price +
                ", releaseDay='" + releaseDay + '\'' +
                '}';
    }

    @Override
    public int compare(Film o1, Film o2) {
        return (int) (o1.getPrice()-o2.getPrice());
    }
}
