package apps.movieService.src.main.java.usesase;

import apps.movieService.src.main.java.response.MovieResponse;
import apps.movieService.src.main.java.response.MovieResponses;

import java.util.List;

public interface MovieListOutputBoundary {
    public void present(MovieResponses useCaseResponse);
}
