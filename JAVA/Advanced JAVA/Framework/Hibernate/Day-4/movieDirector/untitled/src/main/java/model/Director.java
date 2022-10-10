package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Set;
@Entity
public class Director {
    @Id
    private int id;
    private String name;

    @ManyToOne
    private Set<Movie> movies;

    public Director(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public Director() {
    }
}
