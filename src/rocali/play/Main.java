package rocali.play;

import rocali.play.content.Movie;
import rocali.play.platform.Platform;
import rocali.play.utils.ScannerUtils;

import java.util.List;

public class Main {
    public static final String  VERSION = "1.0.0";
    public static final String  PLATFORM_NAME = "ROCALI";
    public static final int  ADD = 1;
    public static final int  SHOW = 2;
    public static final int  SEARCH = 3;
    public static final int  SEARCH_BY_GENDER = 4;
    public static final int  REMOVE = 8;
    public static final int  EXIT = 9;


    public static void main(String[] args) {
        System.out.println("Warming 🏃 up JAVA!");
        System.out.println("A little project for managing Movies 📽.");
        System.out.println("v" + VERSION);
        Platform platform = new Platform(PLATFORM_NAME);
        loadContent(platform);

        while (true) {
            int option = showMenu();
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
                    String title = ScannerUtils.getText("Movie Title: ");
                    Movie movie = platform.searchByTitle(title);

                    if (movie != null) {
                        System.out.println(movie.getDetails());
                    } else {
                        System.out.println(platform.getName() + "have not the movie: " + title);
                    }
                }
                case SEARCH_BY_GENDER -> {
                    String gender = ScannerUtils.getText("Gender: ");
                    List<Movie> movies_by_gender = platform.searchByGender(gender);
                    movies_by_gender.forEach(movie -> System.out.println(movie.getTitle()));
                }
                case REMOVE -> {
                    String title = ScannerUtils.getText("Movie Title to remove: ");
                    Movie movie = platform.removeContentByTitle(title);

                    if (movie != null) {
                        System.out.println("This movie has been deleted from " + platform.getName() + movie.getDetails());
                    } else {
                        System.out.println(platform.getName() + "have not the movie: " + title);
                    }
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

    private static int showMenu() {
        return ScannerUtils.getInt("""
                Type one of the following options:
                1-> Add Movie
                2-> Show All
                3-> Search (Title)
                4-> Search By Gender
                8-> Remove
                9-> Exit
                """);
    }

    private static void loadContent(Platform platform) {
        platform.addContent(new Movie("Memento", 102, "Action", 1999, 3));
        platform.addContent(new Movie("Carabana", 102, "War", 1999, 3));
        platform.addContent(new Movie("Clandestinos", 102, "War", 1999, 3));
        platform.addContent(new Movie("Titanic", 102, "Drama", 1999, 3));
        platform.addContent(new Movie("Pulp Fiction", 102, "Action", 1999, 3));
        platform.addContent(new Movie("Forrest Gump", 102, "Drama", 1999, 3));
        platform.addContent(new Movie("Coco", 102, "Cartoon", 1999, 3));
    }

    private static void showMovie() {

    }

    private static void extracted() {
        String name = ScannerUtils.getText("Please enter your name");
        System.out.println("Hello " + name + ". This is a small project aimed to remain Java.");

        int age = ScannerUtils.getInt("How old are you " + name);
        System.out.println(name + " you can consume content +" + age);
    }
}
