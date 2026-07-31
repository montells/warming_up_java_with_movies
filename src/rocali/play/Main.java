package rocali.play;

import rocali.play.content.Movie;
import rocali.play.platform.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Warming 🏃 up JAVA! With a little project for managing Movies 📽");
        showMovie();
    }

    private static void showMovie() {
        Movie movie = new Movie();
        movie.title = "Pulp Fiction";
        movie.duration = 102;
        movie.deliveryDate = LocalDate.of(2020, Month.JANUARY, 1);
        movie.gender = "Action";
        movie.qualify(4.8);

        System.out.println(movie.getDetails());

        User user = new User();
        user.name = "Michel";
        user.email = "montells@gmail.com";
        user.registrationDate = LocalDateTime.of(2020, Month.JANUARY, 1, 8, 27);
        System.out.println(user.name + " registered at: " + user.registrationDate);
        user.watch(movie);
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
