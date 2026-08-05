package rocali.play.platform;

import rocali.play.content.Movie;

import java.util.ArrayList;
import java.util.List;

public class Platform {
    private String name;
    private List<Movie> content;

    public Platform(String name) {
        this.name = name;
        this.content = new ArrayList<Movie>();
    }

    public void addContent(Movie movie) {
        this.content.add(movie);
    }

    public void showContent() {
        content.forEach(movie -> System.out.println(movie.getTitle()));
    }

    public Movie removeContentByTitle(String title) {
        for (Movie movie : content) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                content.remove(movie);
                return movie;
            }
        }
        return null;
    }

    public Movie searchByTitle(String title) {
        return content.stream()
                .filter(movie -> movie.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public List<Movie> searchByGender(String gender) {
        return content.stream()
                .filter(movie -> movie.getGender().equalsIgnoreCase(gender))
                .toList();
    }

    public String getName() {
        return name;
    }

    public List<Movie> getContent() {
        return this.content;
    }
}
