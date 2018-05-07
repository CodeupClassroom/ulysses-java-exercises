package movies;

import util.Input;

public class MoviesApplication {

    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        System.out.println("Welcome to MovieApp!");

        showMenu();
    }

    public static void showMenu() {
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view animated movies");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println("6 - view movies that are musicals.");

            int choice = getChoice();
            handleChoice(choice);
        } while(true);
    }

    public static int getChoice() {
        Input input = new Input();
        return input.getInt();
    }

    public static void handleChoice(int choice) {
        if(choice == 0) {
            System.out.println("Thank you for using MovieApp. Goodbye!");
            System.exit(0);
        } else if(choice == 1) {
            showMovies();
        } else if(choice == 2) {
            showMovies("animated");
        } else if(choice == 3) {
            showMovies("drama");
        } else if(choice == 4) {
            showMovies("horror");
        } else if(choice == 5) {
            showMovies("scifi");
        } else if(choice == 6) {
            showMovies("musical");
        } else {
            System.out.println("Error, your selection is not a valid choice.");
        }

    }

    public static void showMovies() {
        for(Movie movie : movies) {
            System.out.println(movie.getName() + ", Category: " + movie.getCategory());
        }
    }

    public static void showMovies(String category) {
        for(Movie movie : movies) {
            if(movie.getCategory().equals(category)) {
                System.out.println(movie.getName() + ", Category: " + movie.getCategory());
            }
        }
    }
}
