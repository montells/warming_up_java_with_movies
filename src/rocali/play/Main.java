package rocali.play;

import rocali.play.content.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Warming 🏃 up JAVA! With a little project for managing Movies 📽");
        showMovie();
    }

    private static void showMovie() {
        Movie movie = new Movie();
        movie.title = "Pulp Fiction";
        movie.deliveryYear = 2000;
        movie.gender = "Action";
        movie.qualify(4.8);

        System.out.println(movie.getDetails());
    }

    private static void extracted() {
        System.out.print("Please enter a your name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". This is a small project aimed to remain Java.");

        System.out.print("How old are you " + name + ": ");
        int age = scanner.nextInt();
        System.out.println(name + " you can consume content +" + age);
    }
}
