package rocali.play.content;

import java.time.LocalDate;

public class Movie {
    public String title;
    public String description;
    public int duration;
    public String gender;
    public LocalDate deliveryDate;
    public double qualification;
    public boolean available;

    public Movie(String title, int duration, String gender) {
        this.title = title;
        this.duration = duration;
        this.gender = gender;
        this.available = true;
    }

    public Movie(String title, int duration, String gender, int year, int month, double qualification) {
        this(title, duration, gender);
        this.deliveryDate = LocalDate.of(year, month, 1);
        this.qualify(qualification);
    }

    public void play() {
        System.out.println("Playing the movie " + title);
    }

    public String getDetails() {
        return "Title: " + title + " (" + duration + "m)\n" +
                "Year: " + deliveryDate.getYear() + "\n" +
                "Description: " + description + "\n" +
                "Gender: " + gender + "\n" +
                "Qualification: " + qualification + "/5";
    }

    public void qualify(double qualification) {
        if (qualification >= 0 || qualification <= 5) {
            this.qualification = qualification;
        };
    }

    public boolean isPopular() {
        return qualification >= 4;
    }
}
