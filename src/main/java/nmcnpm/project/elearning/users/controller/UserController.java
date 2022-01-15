package nmcnpm.project.elearning.users.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import nmcnpm.project.elearning.roles.model.Role;
import nmcnpm.project.elearning.users.model.User;

@Tag(name = "UserController", description = "User endpoints")
public interface UserController {
	
	@Operation(method = "GET", description = "Get all users.")
	@ApiResponses({
			@ApiResponse(responseCode = "200", description = "Get users sucessfully.")})
	@GetMapping(value = "/users", produces = "application/json")
	public ResponseEntity<List<User>> getUsers();
	
	@Operation(method = "GET", description = "Get all users by name.")
	@Parameter(name = "name")
	@ApiResponses({
			@ApiResponse(responseCode = "200", description = "Get users sucessfully.")})
	@GetMapping(value = "/users_by_name", produces = "application/json")
	public ResponseEntity<List<User>> getUsersByName(@RequestParam("name") String name);
	
	@Operation(method = "POST", description = "Create user and save database.")
	@Parameter(name = "user")
	@ApiResponses({
		@ApiResponse(responseCode = "CREATED", description = "Create successfully"),
		@ApiResponse(responseCode = "415", description = "Create unsucessfully")
	})
	@PostMapping(value = "/create_user")
	public ResponseEntity<User> createUser(@RequestBody User user);
	
	@Operation(method = "PUT", description = "Update user and save database.")
	@Parameter(name = "id")
	@PutMapping(value = "/update_user/{id}")
	public ResponseEntity<Role> updateUser(@PathVariable("id") Integer id);
	
	@Operation(method = "Delete", description = "Delete user and save database.")
	@Parameter(name = "id")
	@DeleteMapping(value = "/delete_user/{id}")
	public ResponseEntity<Role> deleteUser(@PathVariable("id") Integer id);
}
