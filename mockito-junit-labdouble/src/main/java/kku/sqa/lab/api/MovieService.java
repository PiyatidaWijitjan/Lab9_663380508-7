package kku.sqa.lab.api;

import java.util.List;
import java.util.Map;

public interface MovieService {
    List<Map<String, String>> getPurchasedMovies(String username);
}
