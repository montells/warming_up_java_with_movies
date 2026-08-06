package rocali.play.content;

import java.time.LocalDate;

public class Movie {
    private String title;
    private String description;
    private int duration;
    private Genre genre;
    private LocalDate deliveryDate;
    private double qualification;
    private boolean available;

    public Movie(String title, int duration, Genre genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.available = true;
    }

    public Movie(String title, int duration, Genre genre, int year, int month) {
        this(title, duration, genre);
        this.deliveryDate = LocalDate.of(year, month, 1);
    }

    public void play() {
        System.out.println("Playing the movie " + title);
    }

    public String getDetails() {
        return "Title: " + title + " (" + duration + "m)\n" +
                "Year: " + deliveryDate.getYear() + "\n" +
                "Description: " + description + "\n" +
                "Gender: " + genre + "\n" +
                "Qualification: " + qualification + "/5";
    }

    public Movie qualify(double qualification) {
        if (qualification >= 0 || qualification <= 5) {
            this.qualification = qualification;
        };
        return this;
    }

    public boolean isPopular() {
        return qualification >= 4;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public double getQualification() {
        return qualification;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
