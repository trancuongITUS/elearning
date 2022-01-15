package nmcnpm.project.elearning.courses.service;

import java.util.List;

import org.springframework.stereotype.Service;

import nmcnpm.project.elearning.courses.model.Exercise;
import nmcnpm.project.elearning.courses.repository.ExerciseRepository;

@Service
public class ExerciseServiceImpl implements ExerciseService {
private ExerciseRepository repository;
	
	public  ExerciseServiceImpl(ExerciseRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Exercise> findAll() {
		return repository.findAll();
	}
}
