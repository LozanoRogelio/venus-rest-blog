package roger.venusrestblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import roger.venusrestblog.data.User;

public interface UsersRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByEmail(String email);
}
