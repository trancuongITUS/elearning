package nmcnpm.project.elearning.courses.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import nmcnpm.project.elearning.courses.model.Exercise;

@Tag(name = "ExerciseController", description = "Exercise endpoints")
public interface ExerciseController {
	
	@Operation(method = "GET", description = "Get all exericise")
	@ApiResponse(responseCode = "200", description = "Get sucessfully")
	@GetMapping(value = "/exercises", produces = "application/json")
	public ResponseEntity<List<Exercise>> getExercise();
	
	@Operation(method = "POST", description = "Create exercise")
	@Parameter(name = "exercise")
	@ApiResponse(responseCode = "CREATED", description = "Created successfully")
	@PostMapping(value = "/exercise_create}")
	public ResponseEntity<Exercise> creatExercise(@RequestBody Exercise exercise);
	
	@Operation(method = "PUT", description = "Update exercise and save database.")
	@Parameter(name = "id")
	@PutMapping(value = "/update_exercise/{id}")
	public ResponseEntity<Exercise> updateExercise(@PathVariable("id") Integer id);
	
	@Operation(method = "Delete", description = "Delete exercise and save database.")
	@Parameter(name = "id")
	@DeleteMapping(value = "/delete_exercise/{id}")
	public ResponseEntity<Exercise> deleteExercise(@PathVariable("id") Integer id);
}
