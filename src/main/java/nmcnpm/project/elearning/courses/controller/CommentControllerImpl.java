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

	@Override
	public ResponseEntity<Comment> creatComment(Comment comment) {
		Comment newComment = service.createComment(comment);
		
		return new ResponseEntity<>(newComment, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Comment> updateComment(Integer id, Comment comment) {
		Comment newComment = service.updateComment(id, comment);
		
		return new ResponseEntity<>(newComment, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Comment> deleteComment(Integer id) {
		
		return new ResponseEntity<>(service.deleteComment(id), HttpStatus.OK);
	}

}
