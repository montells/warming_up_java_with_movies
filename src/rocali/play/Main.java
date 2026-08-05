package rocali.play;

import rocali.play.content.Movie;
import rocali.play.platform.Platform;
import rocali.play.platform.User;
import rocali.play.utils.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static final String  VERSION = "1.0.0";
    public static final String  PLATFORM_NAME = "ROCALI";
    public static final int  ADD = 1;
    public static final int  SHOW = 2;
    public static final int  SEARCH = 3;
    public static final int  REMOVE = 4;
    public static final int  EXIT = 5;


    public static void main(String[] args) {
        System.out.println("Warming 🏃 up JAVA!");
        System.out.println("A little project for managing Movies 📽.");
        System.out.println("v" + VERSION);
        Platform platform = new Platform(PLATFORM_NAME);

        while (true) {
            int option = ScannerUtils.getInt("""
                    Type one of the following options:
                    1-> Add Contenido
                    2-> Show All
                    3-> Search (Title)
                    4-> Remove
                    5-> Exit
                    """);
            System.out.println("Choose an option: " + option);
            switch (option) {
                case ADD -> {
                    String title = ScannerUtils.getText("Movie Title");
                    int duration = ScannerUtils.getInt("Movie Duration");
                    int year = ScannerUtils.getInt("Movie Year");
                    int month = ScannerUtils.getInt("Movie Month");
                    double qualification = ScannerUtils.getDecimal("Movie Qualify");

                    platform.addContent(new Movie(title, duration, "Action", year, month));
                }
                case SHOW -> platform.showContent();
                case SEARCH -> {
                    // missing
                }
                case REMOVE -> {
                    // missing
                }
                case EXIT -> {
                    System.out.println("Bye...");
                    System.exit(0);
                }
            }
        }

//        showMovie();
//        extracted();
    }

    private static void showMovie() {

//        System.out.println(movie.getDetails());
//        if (movie.isAvailable()) {
//            System.out.println("The movie " + movie.getTitle() + " is available.");
//        }

//        User user = new User("Michel", "montells@gmail.com");
//        System.out.println(user.getName() + " registered at: " + user.getRegistrationDate());
//        user.watch(movie);


//        int qualificationInt = (int) qualification;
//        long primesAmount = Long.parseLong("4");

//        System.out.println("Qualification Integer: " + qualificationInt);
//        System.out.println("PrimesAmount: " + primesAmount);


//        System.out.println("There are " + platform.getContent().size() + " in the platform " + platform.getName());
//        platform.showContent();
    }

    private static void extracted() {
        String name = ScannerUtils.getText("Please enter your name");
        System.out.println("Hello " + name + ". This is a small project aimed to remain Java.");

        int age = ScannerUtils.getInt("How old are you " + name);
        System.out.println(name + " you can consume content +" + age);
    }
}
