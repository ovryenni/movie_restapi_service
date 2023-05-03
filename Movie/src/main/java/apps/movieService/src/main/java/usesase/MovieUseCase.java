package apps.movieService.src.main.java.usesase;

import apps.movieService.src.main.java.gateway.MovieGateway;
import apps.movieService.src.main.java.request.MovieRequestModel;
import apps.movieService.src.main.java.response.MovieResponse;
import apps.movieService.src.main.java.response.MovieResponses;
import lombok.NoArgsConstructor;

import java.util.List;

public class MovieUseCase implements MovieInputBoundary{

    MovieGateway movieGateway;

    public MovieUseCase(MovieGateway movieGateway) {
        this.movieGateway = movieGateway;
    }

    @Override
    public void detailMovie(MovieRequestModel request, MovieOutputBoundary presenter) {
        MovieResponse movieResponse = movieGateway.detailMovie(request);
        presenter.present(movieResponse);
    }

    @Override
    public void addNewMovie(MovieRequestModel request, MovieOutputBoundary presenter) {
        MovieResponse movieResponse = movieGateway.addNewMovie(request);
        presenter.present(movieResponse);

    }

    @Override
    public void deleteMovie(MovieRequestModel request, MovieOutputBoundary presenter) {
        MovieResponse movieResponse = movieGateway.deleteMovie(request);
        presenter.present(movieResponse);

    }

    @Override
    public void updateMovie(MovieRequestModel request, MovieOutputBoundary presenter) {
        MovieResponse movieResponse = movieGateway.updateMovie(request);
        presenter.present(movieResponse);

    }
}
