public class Movie {
    private String title;
    private int year;
    private String genres;
    private double rating;

    public Movie(String title, int year, String genres, double rating) {
        this.title = title;
        this.year = year;
        this.genres = genres;
        this.rating = rating;
    }

    // Getters og toString metode
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenres() {
        return genres;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie" +
                "title = '" + title + '\'' +
                ", year = " + year +
                ", genres = '" + genres + '\'' +
                ", rating = " + rating;

    }
}
