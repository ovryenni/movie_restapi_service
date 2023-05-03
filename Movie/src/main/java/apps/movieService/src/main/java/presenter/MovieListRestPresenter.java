package apps.movieService.src.main.java.presenter;

import apps.movieService.src.main.java.response.MovieResponse;
import apps.movieService.src.main.java.response.MovieResponses;
import apps.movieService.src.main.java.response.ResponseStatus;
import apps.movieService.src.main.java.usesase.MovieListOutputBoundary;
import apps.movieService.src.main.java.usesase.MovieOutputBoundary;
import lombok.Getter;

import java.util.List;

@Getter
public class MovieListRestPresenter implements MovieListOutputBoundary {
    private MovieResponses response;

    @Override
    public void present(MovieResponses useCaseResponse) {
        response = useCaseResponse;
        response.setResponse(ResponseStatus.API_CALLED_SUCCESS);
    }
}
