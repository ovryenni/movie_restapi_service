package apps.movieService.src.main.java.config;

import apps.movieService.src.main.java.gateway.MovieGateway;
import apps.movieService.src.main.java.gateway.MovieItemGateway;
import apps.movieService.src.main.java.usesase.MovieInputBoundary;
import apps.movieService.src.main.java.usesase.MovieListInputBoundary;
import apps.movieService.src.main.java.usesase.MovieListUseCase;
import apps.movieService.src.main.java.usesase.MovieUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieServiceConfiguration {
    @Bean
    public MovieListInputBoundary movieListUseCase(MovieGateway movieGateway) {
        return new MovieListUseCase(movieGateway);
    }

    @Bean
    public MovieInputBoundary movieInputBoundary(MovieGateway movieGateway) {
        return new MovieUseCase(movieGateway);
    }

    @Bean
    public MovieGateway movieGateway(){
        return new MovieItemGateway();
    }
}
