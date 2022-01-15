package nmcnpm.project.elearning.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nmcnpm.project.elearning.courses.model.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {

}
