package apps.movieService.src.main.java.usesase;

import apps.movieService.src.main.java.response.MovieResponse;

public interface MovieOutputBoundary {
    public void present(MovieResponse useCaseResponse);
}
