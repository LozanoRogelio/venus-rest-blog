package roger.venusrestblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import roger.venusrestblog.data.Category;
import roger.venusrestblog.data.User;


public interface CategoriesRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}