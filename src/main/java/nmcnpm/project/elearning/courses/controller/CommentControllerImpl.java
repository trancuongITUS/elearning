package nmcnpm.project.elearning.courses.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import nmcnpm.project.elearning.courses.model.Comment;
import nmcnpm.project.elearning.courses.service.CommentService;

@RestController
public class CommentControllerImpl implements CommentController {
	private CommentService service;
	
	public CommentControllerImpl(CommentService service) {
		this.service = service;
	}
	
	@Override
	public ResponseEntity<List<Comment>> getComments() {
		List<Comment> comments = service.findAll();
		return new ResponseEntity<>(comments, HttpStatus.OK);
	}

}
