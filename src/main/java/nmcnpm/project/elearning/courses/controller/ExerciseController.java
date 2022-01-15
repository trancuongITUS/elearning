package nmcnpm.project.elearning.courses.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import nmcnpm.project.elearning.courses.model.Exercise;

public interface ExerciseController {
	
	@GetMapping(value = "/exercises", produces = "application/json")
	public ResponseEntity<List<Exercise>> getExercise();
}
