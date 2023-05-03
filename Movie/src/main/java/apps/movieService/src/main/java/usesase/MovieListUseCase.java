package apps.movieService.src.main.java.usesase;

import apps.movieService.src.main.java.gateway.MovieGateway;
import apps.movieService.src.main.java.request.MovieRequestModel;
import apps.movieService.src.main.java.response.MovieListResponse;
import apps.movieService.src.main.java.response.MovieResponse;
import apps.movieService.src.main.java.response.MovieResponses;

import java.util.List;

public class MovieListUseCase implements MovieListInputBoundary{

    MovieGateway movieGateway;

    public MovieListUseCase(MovieGateway movieGateway) {
        this.movieGateway = movieGateway;
    }

    @Override
    public void movieList(MovieRequestModel request, MovieListOutputBoundary presenter) {
        List<MovieListResponse> movieListResponse = movieGateway.movieList(request);
        MovieResponses movieResponses = new MovieResponses();
        movieResponses.setResponse(movieListResponse);

        presenter.present(movieResponses);
    }

}
