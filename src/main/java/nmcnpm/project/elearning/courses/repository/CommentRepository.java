package nmcnpm.project.elearning.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nmcnpm.project.elearning.courses.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
