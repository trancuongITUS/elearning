package nmcnpm.project.elearning.courses.service;

import java.util.List;

import nmcnpm.project.elearning.courses.model.Exercise;

public interface ExerciseService {
	public List<Exercise> findAll();
	public Exercise createExercise(Exercise exercise);
	public Exercise updateExercise(Integer id);
	public Exercise deleteExercise(Integer id);
}
