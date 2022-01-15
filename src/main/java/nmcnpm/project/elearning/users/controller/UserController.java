package nmcnpm.project.elearning.users.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.tags.Tag;
import nmcnpm.project.elearning.users.model.User;

@Tag(name = "UserController", description = "User endpoints")
public interface UserController {
	
	@GetMapping(value = "/users", produces = "application/json")
	public ResponseEntity<List<User>> getUsers();
	
	@GetMapping(value = "/users_by_name", produces = "application/json")
	public ResponseEntity<List<User>> getUsersByName(@RequestParam("name") String name);
	
}
