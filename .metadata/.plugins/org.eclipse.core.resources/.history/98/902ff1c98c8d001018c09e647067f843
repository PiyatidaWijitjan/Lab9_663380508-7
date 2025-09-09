package kku.sqa.lab.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import kku.sqa.lab.api.MovieService;

public class FavoriteMovie {
    private MovieService movieservice;

    public FavoriteMovie(MovieService movieservice) {
        this.movieservice = movieservice;
    }

    public List<String> getMoviesByPlaylist(String username, String playlistName) {
        return movieservice.getPurchasedMovies(username).stream()
                .filter(m -> playlistName.equalsIgnoreCase(m.get("playlist")))
                .map(m -> m.get("title"))
                .collect(Collectors.toList());
    }
}
