package rocali.play.exception;

public class AlreadyExistingMovieException extends RuntimeException {
    public AlreadyExistingMovieException(String title) {
        super("The movie " + title + " already exists.");
    }
}
