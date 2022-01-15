package nmcnpm.project.elearning.courses.service;

import java.util.List;

import nmcnpm.project.elearning.courses.model.Course;

public interface CoursesService {
	public List<Course> findAll();
	public List<Course> findByName(String name);
}
