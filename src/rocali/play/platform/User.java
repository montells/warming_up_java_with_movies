package rocali.play.platform;

import rocali.play.content.Movie;

import java.time.LocalDateTime;

public class User {
    public String name;
    public String email;
    public LocalDateTime registrationDate;

    public void watch(Movie movie) {
        System.out.println("Watching...");
        movie.play();
    }
}
