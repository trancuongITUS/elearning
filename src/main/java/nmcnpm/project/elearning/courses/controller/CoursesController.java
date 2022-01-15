package nmcnpm.project.elearning.courses.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import nmcnpm.project.elearning.courses.model.Course;

@Tag(name = "CoursesController", description = "Courses(course, exercise, video, comment) endpoint.")
public interface CoursesController {
	
	@Operation(method = "GET", description = "Get all courses")
	@ApiResponse(responseCode = "200", description = "Get sucessfully")
	@GetMapping(value = "/courses", produces = "application/json")
	public ResponseEntity<List<Course>> getCourses();
	
	@Operation(method = "GET", description = "Get all courses by name")
	@ApiResponse(responseCode = "200", description = "Get sucessfully")
	@GetMapping(value = "/courses_by_name", produces = "application/json")
	public ResponseEntity<List<Course>> getCoursesByName(@RequestParam("name") String name);
	
	@Operation(method = "POST", description = "Create course")
	@Parameter(name = "course")
	@ApiResponse(responseCode = "CREATED", description = "Created successfully")
	@PostMapping(value = "/course_create}")
	public ResponseEntity<Course> creatCourse(@RequestBody Course course);
	
	@Operation(method = "PUT", description = "Update course and save database.")
	@Parameter(name = "id")
	@PutMapping(value = "/update_course/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable("id") Integer id);
	
	@Operation(method = "Delete", description = "Delete course and save database.")
	@Parameter(name = "id")
	@DeleteMapping(value = "/delete_course/{id}")
	public ResponseEntity<Course> deleteCourse(@PathVariable("id") Integer id);
}
