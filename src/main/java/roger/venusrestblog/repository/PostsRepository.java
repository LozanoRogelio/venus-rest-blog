package roger.venusrestblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import roger.venusrestblog.data.Post;

public interface PostsRepository extends JpaRepository<Post, Long> {

}
