package apps.movieService.src.main.java.presenter;

import apps.movieService.src.main.java.response.MovieResponse;
import apps.movieService.src.main.java.response.ResponseStatus;
import apps.movieService.src.main.java.usesase.MovieOutputBoundary;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Getter
public class MovieRestPresenter implements MovieOutputBoundary {
    private MovieResponse response;

    @Override
    public void present(MovieResponse useCaseResponse) {
        response = useCaseResponse;
        response.setResponse(ResponseStatus.API_CALLED_SUCCESS);
    }
}
