package rocali.play.platform;

import rocali.play.content.ContentSummary;
import rocali.play.content.Genre;
import rocali.play.content.Movie;
import rocali.play.exception.AlreadyExistingMovieException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Platform {
    private String name;
    private List<Movie> content;

    public Platform(String name) {
        this.name = name;
        this.content = new ArrayList<Movie>();
    }

    public void addContent(Movie movie) {
        Movie existingMovie = searchByTitle(movie.getTitle());

        if (existingMovie != null) {
            throw new AlreadyExistingMovieException(movie.getTitle());
        }

        this.content.add(movie);
    }

    public List<String> getTitles() {
        return content.stream().map(Movie::getTitle).toList();
    }

    public List<ContentSummary> getContentSummary() {
        return content.stream()
                .map(movie -> new ContentSummary(movie.getTitle(), movie.getDuration(), movie.getGenre()))
                .toList();
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

    public int getTotalDuration() {
        return content.stream().mapToInt(Movie::getDuration).sum();
    }

    public List<Movie> getPopulars(int amount) {
        return content.stream()
                .sorted(Comparator.comparingDouble(Movie::getQualification)
                .reversed())
                .limit(amount)
                .toList();
    }

    public Movie searchByTitle(String title) {
        return content.stream()
                .filter(movie -> movie.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public List<Movie> searchByGender(Genre genre) {
        return content.stream()
                .filter(movie -> movie.getGenre().equals(genre))
                .toList();
    }

    public String getName() {
        return name;
    }

    public List<Movie> getContent() {
        return this.content;
    }
}
