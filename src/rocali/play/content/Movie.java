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
