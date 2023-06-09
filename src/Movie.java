import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public static Comparator<Movie> getSortByMovieName() {
        return sortByMovieName;
    }

    public static void setSortByMovieName(Comparator<Movie> sortByMovieName) {
        Movie.sortByMovieName = sortByMovieName;
    }

    public static Comparator<Movie> getSortByMovieYear() {
        return sortByMovieYear;
    }

    public static void setSortByMovieYear(Comparator<Movie> sortByMovieYear) {
        Movie.sortByMovieYear = sortByMovieYear;
    }

    public static Comparator<Movie> getSortByMovieDirector() {
        return sortByMovieDirector;
    }

    public static void setSortByMovieDirector(Comparator<Movie> sortByMovieDirector) {
        Movie.sortByMovieDirector = sortByMovieDirector;
    }

    public static Comparator<Movie>sortByMovieName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie>sortByMovieYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };
    public static Comparator<Movie>sortByMovieDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.name);
        }
    };

    @Override
    public String toString() {
        return "Movie" +
                "name: " + name + '\'' +
                "year: " + year +
                "description: " + description + '\'' +
                "director: " + director +
                "casts:" + cast ;
    }
}
