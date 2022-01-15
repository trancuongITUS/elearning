package nmcnpm.project.elearning.courses.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.tags.Tag;
import nmcnpm.project.elearning.courses.model.Course;

@Tag(name = "CoursesController", description = "Courses(course, exercise, video, comment) endpoint.")
public interface CoursesController {
	
	@GetMapping(value = "/courses", produces = "application/json")
	public ResponseEntity<List<Course>> getCourses();
	
	@GetMapping(value = "/courses_by_name", produces = "application/json")
	public ResponseEntity<List<Course>> getCoursesByName(@RequestParam("name") String name);
	
	
}
