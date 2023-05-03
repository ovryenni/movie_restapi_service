package apps.movieService.src.main.java.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieEntity {
    int id;
    String title;
    String description;
    int rating;
    String image;
    Timestamp created_at;
    Timestamp updated_at;
}
