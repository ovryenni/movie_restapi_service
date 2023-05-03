package apps.movieService.src.main.java.usesase;

import apps.movieService.src.main.java.request.MovieRequestModel;

public interface MovieInputBoundary {
    void detailMovie(MovieRequestModel request, MovieOutputBoundary presenter);
    void addNewMovie(MovieRequestModel request, MovieOutputBoundary presenter);
    void deleteMovie(MovieRequestModel request, MovieOutputBoundary presenter);
    void updateMovie(MovieRequestModel request, MovieOutputBoundary presenter);

}
