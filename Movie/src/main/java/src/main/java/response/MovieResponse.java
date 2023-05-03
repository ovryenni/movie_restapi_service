package src.main.java.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse {
    int id;
    String title;
    String description;
    int rating;
    String image;
    Timestamp created_at;
    Timestamp updated_at;
}
