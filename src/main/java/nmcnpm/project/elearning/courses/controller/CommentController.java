package nmcnpm.project.elearning.courses.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nmcnpm.project.elearning.courses.model.Comment;

@RestController
public interface CommentController {
	@GetMapping(value = "/comments", produces = "application/json")
	public ResponseEntity<List<Comment>> getComments();
}
