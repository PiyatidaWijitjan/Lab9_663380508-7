package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.data.stub.*;

class FavoriteMovieTest {

    @Test
    void test_getDatenight() {
        MovieService movieservice = new MovieServiceStub();
        FavoriteMovie favoritemovie = new FavoriteMovie(movieservice);
        
        List<String> movielist = favoritemovie.getMoviesByPlaylist("anyuser", "datenight");
        assertEquals(1, movielist.size());
        assertEquals("The Notebook", movielist.get(0));
    }
    
    @Test
    void test_getFavorites() {
        MovieService movieservice = new MovieServiceStub();
        FavoriteMovie favoritemovie = new FavoriteMovie(movieservice);
        
        List<String> movielist = favoritemovie.getMoviesByPlaylist("anyuser", "favorites");
        assertEquals(2, movielist.size());
        assertTrue(movielist.contains("John Wick"));
        assertTrue(movielist.contains("Mad Max: Fury Road"));
    }
    
    @Test
    void test_getEmptyPlaylist() {
        MovieService movieservice = new MovieServiceStub();
        FavoriteMovie favoritemovie = new FavoriteMovie(movieservice);
        
        List<String> movielist = favoritemovie.getMoviesByPlaylist("anyuser", "nonexistent");
        assertTrue(movielist.isEmpty());
    }
}
