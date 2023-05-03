package apps.movieService.src.main.java.gateway;

import apps.movieService.src.main.java.Entity.MovieEntity;
import apps.movieService.src.main.java.request.MovieRequestModel;
import apps.movieService.src.main.java.response.MovieListResponse;
import apps.movieService.src.main.java.response.MovieResponse;
import apps.movieService.src.main.java.usesase.MovieOutputBoundary;

import java.util.List;

public interface MovieGateway {
    List<MovieListResponse> movieList(MovieRequestModel request);
    MovieResponse detailMovie(MovieRequestModel request);
    MovieResponse addNewMovie(MovieRequestModel request);
    MovieResponse deleteMovie(MovieRequestModel request);
    MovieResponse updateMovie(MovieRequestModel request);
}
