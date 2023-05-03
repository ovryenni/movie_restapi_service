package apps.movieService.src.main.java.controller;

import apps.movieService.src.main.java.presenter.MovieListRestPresenter;
import apps.movieService.src.main.java.presenter.MovieRestPresenter;
import apps.movieService.src.main.java.response.MovieListResponse;
import apps.movieService.src.main.java.response.MovieResponses;
import apps.movieService.src.main.java.usesase.MovieInputBoundary;
import apps.movieService.src.main.java.usesase.MovieListInputBoundary;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import apps.movieService.src.main.java.constant.MovieConstant;
import apps.movieService.src.main.java.request.MovieRequest;
import apps.movieService.src.main.java.request.MovieRequestModel;
import apps.movieService.src.main.java.response.MovieResponse;
import apps.movieService.src.main.java.usesase.ServiceUtilities;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class MovieController {
    private final MovieInputBoundary useCase;
    private final MovieListInputBoundary listUseCase;
    @RequestMapping(value = "/" + MovieConstant.URI_HEALTH_CHECKER,  method = RequestMethod.GET)
    public ResponseEntity<MovieResponse> healthCheck() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = MovieConstant.MOVIE_LIST)
    public List<MovieListResponse> movieList (@Valid MovieRequestModel requestModel) {
        MovieListRestPresenter presenter = new MovieListRestPresenter();

        listUseCase.movieList(requestModel, presenter);
        return presenter.getResponse().getResponse();
    }
    @GetMapping(value = MovieConstant.DETAIL_MOVIE)
    public MovieResponse detailMovie (@Valid MovieRequestModel requestModel) {
        MovieRestPresenter presenter = new MovieRestPresenter();

        useCase.detailMovie(requestModel, presenter);
        return presenter.getResponse();
    }

    @PostMapping(value = MovieConstant.ADD_NEW_MOVIE)
    public MovieResponse addNewMovie (@Valid MovieRequestModel requestModel) {
        MovieRestPresenter presenter = new MovieRestPresenter();

        useCase.addNewMovie(requestModel, presenter);
        return presenter.getResponse();
    }
    @PatchMapping(value = MovieConstant.UPDATE_MOVIE)
    public MovieResponse updateMovie (@Valid MovieRequestModel requestModel) {
        MovieRestPresenter presenter = new MovieRestPresenter();

        useCase.updateMovie(requestModel, presenter);
        return presenter.getResponse();
    }

    @GetMapping(value = MovieConstant.DELETE_MOVIE)
    public MovieResponse deleteMovie (@Valid MovieRequestModel requestModel) {
        MovieRestPresenter presenter = new MovieRestPresenter();

        useCase.deleteMovie(requestModel, presenter);
        return presenter.getResponse();
    }
}
