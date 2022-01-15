package nmcnpm.project.elearning.courses.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import nmcnpm.project.elearning.courses.model.Course;
import nmcnpm.project.elearning.courses.service.CoursesService;

@RestController
public class CoursesControllerImpl implements CoursesController {
	private CoursesService service;
	
	public CoursesControllerImpl(CoursesService service) {
		this.service = service;
	}
	
	@Override
	public ResponseEntity<List<Course>> getCourses() {
		List<Course> courses = service.findAll();
		return new ResponseEntity<>(courses, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Course>> getCoursesByName(String name) {
		List<Course> courses = service.findByName(name);
		return new ResponseEntity<>(courses, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Course> creatCourse(Course course) {
		return new ResponseEntity<>(service.createCourse(course), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Course> updateCourse(Integer id) {
		return new ResponseEntity<>(service.updateCourse(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Course> deleteCourse(Integer id) {
		return new ResponseEntity<>(service.deleteCourse(id), HttpStatus.OK);
	}

}
