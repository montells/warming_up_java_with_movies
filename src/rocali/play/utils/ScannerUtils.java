package rocali.play.utils;

import rocali.play.content.Genre;

import java.util.Locale;
import java.util.Scanner;

public class ScannerUtils {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static String getText(String message){
        System.out.println(message + ": ");
        return SCANNER.nextLine();
    }

    public static int getInt(String message){
        System.out.println(message + ": ");

        while (!SCANNER.hasNextInt()) {
            System.out.println("Invalid input \n" + message);
            SCANNER.next();
        }

        int number = SCANNER.nextInt();
        SCANNER.nextLine();
        return number;
    }

    public static double getDecimal(String message){
        System.out.println(message + ": ");

        while (!SCANNER.hasNextDouble()) {
            System.out.println("Invalid input \n" + message);
            SCANNER.next();
        }

        double number = SCANNER.nextDouble();
        SCANNER.nextLine();
        return number;
    }

    public static Genre getGenre(String message){
        while (true) {
            System.out.println("...Opcions");
            for (Genre genre : Genre.values()) {
                System.out.println("-" + genre.name());
            }

            System.out.println("Which genre would you like to choose?");
            String text = SCANNER.nextLine();

            try {
                return  Genre.valueOf(text.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input \n" + message + ":");
            }

        }
    }
}
