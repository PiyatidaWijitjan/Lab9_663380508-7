package kku.sqa.lab.service;
import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.data.stub.MovieServiceStub;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FavoriteMovieTest {
   
    @Test
    void test_getActionMovies() {
        MovieService movieservice = new MovieServiceStub();
        FavoriteMovie favoritemovie = new FavoriteMovie(movieservice);
        
        List<String> actionMovies = favoritemovie.getMoviesByPlaylist("piyatida", "action");
        
        assertEquals(3, actionMovies.size());
    }
}
