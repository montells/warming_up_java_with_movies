package rocali.play;

import rocali.play.content.Movie;
import rocali.play.platform.User;
import rocali.play.utils.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static final String  VERSION = "1.0.0";

    public static void main(String[] args) {
        System.out.println("Warming 🏃 up JAVA!");
        System.out.println("A little project for managing Movies 📽.");
        System.out.println("v" + VERSION);
        showMovie();
//        extracted();
    }

    private static void showMovie() {
        String title = ScannerUtils.getText("Movie Title");
        int duration = ScannerUtils.getInt("Movie Duration");
        int year = ScannerUtils.getInt("Movie Year");
        int month = ScannerUtils.getInt("Movie Month");
        double qualification = ScannerUtils.getDecimal("Movie Qualify");

        Movie movie = new Movie(title, duration, "Action", year, month);
        movie.qualify(qualification);
        System.out.println(movie.getDetails());
        if (movie.isAvailable()) {
            System.out.println("The movie " + movie.getTitle() + " is available.");
        }

        User user = new User("Michel", "montells@gmail.com");
        System.out.println(user.getName() + " registered at: " + user.getRegistrationDate());
        user.watch(movie);


        int qualificationInt = (int) qualification;
        long primesAmount = Long.parseLong("4");

        System.out.println("Qualification Integer: " + qualificationInt);
        System.out.println("PrimesAmount: " + primesAmount);
    }

    private static void extracted() {
        String name = ScannerUtils.getText("Please enter your name");
        System.out.println("Hello " + name + ". This is a small project aimed to remain Java.");

        int age = ScannerUtils.getInt("How old are you " + name);
        System.out.println(name + " you can consume content +" + age);
    }
}
