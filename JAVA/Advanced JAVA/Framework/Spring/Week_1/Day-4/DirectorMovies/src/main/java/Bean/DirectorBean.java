package Bean;

import java.util.Map;
import java.util.Set;

public class DirectorBean {
    private Set<String> joner;
    private Map<MovieBean ,String> movie;


    @Override
    public String toString() {
        return "DirectorBean{" +
                "joner=" + joner +
                ", movie=" + movie +
                '}';
    }

    public Set<String> getJoner() {
        return joner;
    }

    public void setJoner(Set<String> joner) {
        this.joner = joner;
    }

    public Map<MovieBean, String> getMovie() {
        return movie;
    }

    public void setMovie(Map<MovieBean, String> movie) {
        this.movie = movie;
    }

    public void display() {
        joner.forEach(System.out::println);
        movie.entrySet().forEach(System.out::println);
    }
}
