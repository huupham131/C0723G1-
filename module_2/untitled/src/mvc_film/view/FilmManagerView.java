package mvc_film.view;

import mvc_film.controller.FilmController;
import mvc_film.model.Film;
import mvc_film.util.FileUtil;
import mvc_film.util.Regex;

import java.util.List;
import java.util.Scanner;

public class FilmManagerView {
    private final FilmController filmController = new FilmController();
    private final Scanner scanner = new Scanner(System.in);
    private final String ID_TICKET_REGEX = "^MV-\\d{3}$";

    public void displayMenu() {
        System.out.println("===FILM MANAGEMENT===");
        System.out.println("""
                1. Add new film
                2. Display all film
                3. Delete film by id
                4. Edit film by id
                5. Search film by name
                6. Sort
                7. Exit e""");

    }

    private int choose(int min, int max) {
        int choose;
        do {
            try {
                System.out.println("Enter you choose");
                choose = Integer.parseInt(scanner.nextLine());
                if (choose < min || choose > max) {
                    System.out.println("Choose must be in range");
                } else {
                    return choose;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter integer choice");
            }
        } while (true);
    }

    public void handleFilmManagerView(int choose) {
        switch (choose) {
            case 1:
                Film film = new Film();
                film.setIdTicket(inputId());
                film.setNameOfFilm(inputName());
                film.setPrice(inputPrice());
                film.setReleaseDay(inputRelease());
                filmController.create(film);
                break;
            case 2:
                System.out.println(filmController.getAllFilm());
                break;
            case 3:
                System.out.println("Enter id to delete:");
                String idDelete;
                do {
                    idDelete = scanner.nextLine();
                    if (Regex.validata(idDelete, ID_TICKET_REGEX)) {
                        break;
                    } else {
                        System.out.println("ID input not regex");
                    }
                } while (true);
                if (checkId(idDelete)) {
                    System.out.println("""
                            You sure?
                            1. Yes
                            2. No""");
                    int chooseMiniOption = choose(1, 2);
                    if (chooseMiniOption == 1) {
                        filmController.delete(idDelete);
                        System.out.println("Delete completed");
                    }

                } else {
                    System.out.println("id not found");
                }
                break;
            case 4:
                System.out.println("Enter id for edit:");
                String idEdit;
                do {
                    idEdit = scanner.nextLine();
                    if (Regex.validata(idEdit, ID_TICKET_REGEX)) {
                        break;
                    } else {
                        System.out.println("id not regex");
                    }
                } while (true);
                if (checkId(idEdit)) {
                    Film film1 = new Film();
                    film1.setIdTicket(idEdit);
                    film1.setNameOfFilm(inputName());
                    film1.setPrice(inputPrice());
                    film1.setReleaseDay(inputRelease());
                    filmController.edit(film1);
                    System.out.println("Edit completed");
                } else {
                    System.out.println("Id not found");
                }
                break;
            case 5:
                System.out.println("Enter name for search:");
                String name = scanner.nextLine();
                filmController.searchByName(name);
                break;
            case 6:
                filmController.sortByPrice();
                break;
            case 7:
                System.exit(1);
        }
    }

    public void render() {
        while (true) {
            displayMenu();
            handleFilmManagerView(choose(1, 7));
        }
    }

    public String inputId() {
        String id;
        do {
            System.out.println("Enter Id code film");
            id = scanner.nextLine().trim();
            if (id.isEmpty()) {
                System.out.println("Id is empty.Please enter again");
            } else if (Regex.validata(id, ID_TICKET_REGEX)) {
                if (checkId(id)) {
                    System.out.println("Id was existed");
                } else {
                    return id;
                }
            } else {
                System.out.println("Id invalid");
            }
        } while (true);
    }

    private boolean checkId(String id) {
        List<Film> list = filmController.getAllFilm();
        boolean check = false;
        for (Film film : list) {
            if (film.getIdTicket().equals(id)) {
                check = true;
                return check;
            }
        }
        return check;
    }

    private String inputName() {
        String name;
        do {
            System.out.println("Enter name film");
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Name is empty.Please enter again");
            } else {
                return name;
            }
        } while (true);
    }

    private Double inputPrice() {
        double price;
        do {
            try {
                System.out.println("Enter price film");
                price = Double.parseDouble(scanner.nextLine().trim());
                if (price < 0) {
                    System.out.println("Price must be greater than 0");
                } else {
                    return price;
                }
            } catch (NumberFormatException e) {
                System.out.println("Pl enter valid input");
            }
        } while (true);
    }

    private String inputRelease() {
        String releaseDay;
        do {
            System.out.println("Enter releaseDay film");
            releaseDay = scanner.nextLine().trim();
            if (releaseDay.isEmpty()) {
                System.out.println("releaseDay is empty.Please enter again");
            } else {
                return releaseDay;

            }
        } while (true);
    }
}
