package roger.venusrestblog.data;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class User {
    private long id;
    private String userName;
    private String email;
    private String password;
    private LocalDate createdAt;
    private UserRole role;

}

