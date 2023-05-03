package apps.movieService.src.main.java.Entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.Timestamp;

@RequiredArgsConstructor
@Getter
@Setter
@EntityScan
//@Table(name = "approval_task_configurations")
public class MovieEntity {
    int id;
    String title;
    String description;
    int rating;
    String image;
    Timestamp created_at;
    Timestamp updated_at;
}
