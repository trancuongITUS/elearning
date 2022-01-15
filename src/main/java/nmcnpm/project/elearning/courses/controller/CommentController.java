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
import nmcnpm.project.elearning.courses.model.Comment;

@Tag(name = "CommentController", description = "Comment endpoints")
public interface CommentController {
	
	@Operation(method = "GET", description = "Get all comments")
	@ApiResponse(responseCode = "200", description = "Get comments sucessfully")
	@GetMapping(value = "/comments", produces = "application/json")
	public ResponseEntity<List<Comment>> getComments();
	
	@Operation(method = "POST", description = "Create comment")
	@Parameter(name = "comment")
	@ApiResponse(responseCode = "CREATED", description = "Created successfully")
	@PostMapping(value = "/comment_create}")
	public ResponseEntity<Comment> creatComment(@RequestBody Comment comment);
	
	@Operation(method = "PUT", description = "Update comment and save database.")
	@Parameter(name = "id")
	@PutMapping(value = "/update_comment/{id}")
	public ResponseEntity<Comment> updateComment(@PathVariable("id") Integer id, @RequestBody Comment comment);
	
	@Operation(method = "Delete", description = "Delete comment and save database.")
	@Parameter(name = "id")
	@DeleteMapping(value = "/delete_comment/{id}")
	public ResponseEntity<Comment> deleteComment(@PathVariable("id") Integer id);
}
