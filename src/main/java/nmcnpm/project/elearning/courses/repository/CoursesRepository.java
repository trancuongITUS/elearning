package nmcnpm.project.elearning.courses.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nmcnpm.project.elearning.courses.model.Course;

@Repository
public interface CoursesRepository extends JpaRepository<Course, Integer> {
	public List<Course> findByName(String name);
}
