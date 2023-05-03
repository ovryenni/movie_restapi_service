package apps.movieService.src.main.java.gateway;

import apps.movieService.src.main.java.request.MovieRequestModel;
import apps.movieService.src.main.java.response.MovieListResponse;
import apps.movieService.src.main.java.response.MovieResponse;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class MovieItemGateway implements MovieGateway{
    @Override
    public List<MovieListResponse> movieList(MovieRequestModel request) {
        return null;
    }

    @Override
    public MovieResponse detailMovie(MovieRequestModel request) {
        return null;
    }

    @Override
    public MovieResponse addNewMovie(MovieRequestModel request) {
        return null;
    }

    @Override
    public MovieResponse deleteMovie(MovieRequestModel request) {
        return null;
    }

    @Override
    public MovieResponse updateMovie(MovieRequestModel request) {
        return null;
    }
}
