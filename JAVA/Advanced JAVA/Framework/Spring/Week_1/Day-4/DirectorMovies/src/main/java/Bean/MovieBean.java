package Bean;

public class MovieBean {
    String movieName;

    @Override
    public String toString() {
        return "MovieBean{" +
                "movieName='" + movieName + '\'' +
                ", movieYear=" + movieYear +
                '}';
    }

    int movieYear;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }
}
