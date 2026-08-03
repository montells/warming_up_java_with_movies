package rocali.play.platform;

import rocali.play.content.Movie;

import java.time.LocalDateTime;
import java.time.Month;

public class User {
    private String name;
    private String email;
    private LocalDateTime registrationDate;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.registrationDate = LocalDateTime.of(2020, Month.JANUARY, 1, 8, 27);
    }

    public void watch(Movie movie) {
        System.out.println("Watching...");
        movie.play();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }
}
