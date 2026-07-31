package rocali.play.platform;

import rocali.play.content.Movie;

public class User {
    public String name;
    public String email;

    public void watch(Movie movie) {
        System.out.println("Watching...");
        movie.play();
    }
}
