package vadimshokh.blogspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vadimshokh.blogspring.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}