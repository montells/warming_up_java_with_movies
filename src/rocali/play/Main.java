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
    public static void main(String[] args) {
        System.out.println("Warming 🏃 up JAVA! With a little project for managing Movies 📽");
        showMovie();
//        extracted();
    }

    private static void showMovie() {
        String title = ScannerUtils.getText("Movie Title");
        int duration = ScannerUtils.getInt("Movie Duration");
        int year = ScannerUtils.getInt("Movie Year");
        int month = ScannerUtils.getInt("Movie Month");
        double qualification = ScannerUtils.getDecimal("Movie Qualify");

        Movie movie = new Movie();
        movie.title = title;
        movie.duration = duration;
        movie.deliveryDate = LocalDate.of(year, month, 1);
        movie.gender = "Action";
        movie.qualify(qualification);

        System.out.println(movie.getDetails());

        User user = new User();
        user.name = "Michel";
        user.email = "montells@gmail.com";
        user.registrationDate = LocalDateTime.of(2020, Month.JANUARY, 1, 8, 27);
        System.out.println(user.name + " registered at: " + user.registrationDate);
        user.watch(movie);


        int qualificationInt = (int) movie.qualification;
        long primesAmount = Long.parseLong("25");

        System.out.println("Qualification: " + qualificationInt);
        System.out.println("PrimesAmount: " + primesAmount);
    }

    private static void extracted() {
        String name = ScannerUtils.getText("Please enter your name");
        System.out.println("Hello " + name + ". This is a small project aimed to remain Java.");

        int age = ScannerUtils.getInt("How old are you " + name);
        System.out.println(name + " you can consume content +" + age);
    }
}
