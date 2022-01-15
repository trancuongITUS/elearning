package nmcnpm.project.elearning.courses.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import nmcnpm.project.elearning.courses.model.Exercise;
import nmcnpm.project.elearning.courses.service.ExerciseService;

@RestController
public class ExerciseControllerImpl implements ExerciseController {
	private ExerciseService service;
	
	public ExerciseControllerImpl(ExerciseService service) {
		this.service = service;
	}

	@Override
	public ResponseEntity<List<Exercise>> getExercise() {
		List<Exercise> exercises = service.findAll();
		return new ResponseEntity<>(exercises, HttpStatus.OK);
	}
	
}
