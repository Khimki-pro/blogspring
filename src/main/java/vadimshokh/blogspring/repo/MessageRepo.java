package vadimshokh.blogspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vadimshokh.blogspring.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
