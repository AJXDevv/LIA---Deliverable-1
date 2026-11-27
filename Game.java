public class Game {
    private String title;
    private String characterNames;
    private double rating;

    public Game(String title, String characterNames) {
        this.title = title;
        this.characterNames = characterNames;
        this.rating = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public void rate(double rating) {
        this.rating = rating;
    }

    public void displayInfo() {
        System.out.println(title + " - " + characterNames);
        System.out.println("Rating: " + rating);
    }
}
