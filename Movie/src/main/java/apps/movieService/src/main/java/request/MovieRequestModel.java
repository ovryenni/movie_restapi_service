package apps.movieService.src.main.java.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.sql.Timestamp;

@Data
public class MovieRequestModel {
    @Positive
    public int id;
    String title;
    String description;
    int rating;
    String image;
    Timestamp created_at;
    Timestamp updated_at;
}
