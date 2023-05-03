package apps.movieService.src.main.java.usesase;

import apps.movieService.src.main.java.request.MovieRequestModel;

public interface MovieListInputBoundary {
    void movieList(MovieRequestModel request, MovieListOutputBoundary presenter);

}
