package br.dev.henriquekh.senacCourse;

public class Movie {
    private String title;
    private String[] actors;
    private String director;
    private int year;
    private String imdbId;
    private AgeRating ageRating;

    Movie(String title, String[] actors, String director, int year, String imdbId, AgeRating ageRating) {
        this.title = title;
        this.actors = actors;
        this.director = director;
        this.year = year;
        this.imdbId = imdbId;
        this.ageRating = ageRating;
    }

    public String[] getActors() {
        return actors;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getTitle() {
        return title;
    }

    public AgeRating getAgeRating() {
        return ageRating;
    }

    public void displayInfo() {
        System.out.printf("%s (%d) [%s]\n", getTitle(), getYear(), getImdbId());
        System.out.printf("\tDirector: %s\n", getDirector());
        System.out.printf("\tActors:\n");
        for (String actor : getActors()) {
            System.out.printf("\t- %s\n", actor);
        }
        System.out.printf("\tIdade Minima: %d\n", getAgeRating().getMinimumAge());
    }
}
