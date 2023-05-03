package src.main.java.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import src.main.java.constant.MovieConstant;
import src.main.java.response.MovieResponse;
import src.main.java.usesase.ServiceUtilities;

import java.util.Map;

@RestController
public class MovieController {
    @RequestMapping(value = "/" + MovieConstant.URI_HEALTH_CHECKER,  method = RequestMethod.GET)
    public ResponseEntity<MovieResponse> healthCheck() {
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping(value = "/" + MovieConstant.MOVIE_LIST,  method = RequestMethod.GET)
    public ResponseEntity<MovieResponse> movieList() {
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping(value = "/" + MovieConstant.DETAIL_MOVIE,  method = RequestMethod.GET)
    public ResponseEntity<MovieResponse> detailMovie() {
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping(value = "/" + MovieConstant.ADD_NEW_MOVIE,  method = RequestMethod.POST)
    public ResponseEntity<MovieResponse> addMovie(HttpServletRequest request, HttpServletResponse response) {

        Map<String, String> paramMap = ServiceUtilities.constructParamMap(request);

        ResponseEntity<MovieResponse> responseEntity = addNewMovie(
                paramMap.get(AnalyticsConstant.USER_ID_PARAM),
                paramMap.get(AnalyticsConstant.CLIENT_ID_PARAM),
                paramMap.get(AnalyticsConstant.ADVOCATE_ID_PARAM),
                paramMap.get(AnalyticsConstant.BENEFICIARY_PARAM),
                paramMap.get(AnalyticsConstant.STATUS_LIST_PARAM),
                paramMap.get(AnalyticsConstant.START_DATE_PARAM),
                paramMap.get(AnalyticsConstant.END_DATE_PARAM));

        return responseEntity;
    }

    @RequestMapping(value = "/" + MovieConstant.UPDATE_MOVIE,  method = RequestMethod.POST)
    public ResponseEntity<MovieResponse> updateMovie() {
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping(value = "/" + MovieConstant.DELETE_MOVIE,  method = RequestMethod.GET)
    public ResponseEntity<MovieResponse> deleteMovie() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
