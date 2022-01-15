package nmcnpm.project.elearning.courses.service;

import java.util.List;

import org.springframework.stereotype.Service;

import nmcnpm.project.elearning.courses.model.Course;
import nmcnpm.project.elearning.courses.repository.CoursesRepository;

@Service
public class CoursesServiceImpl implements CoursesService {
	private CoursesRepository repository;
	
	public CoursesServiceImpl(CoursesRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Course> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Course> findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public Course createCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course updateCourse(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course deleteCourse(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
