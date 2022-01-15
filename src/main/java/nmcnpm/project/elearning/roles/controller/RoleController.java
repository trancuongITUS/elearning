package nmcnpm.project.elearning.roles.controller;

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
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import nmcnpm.project.elearning.roles.model.Role;

@Tag(name = "RoleController", description = "Role endpoints")
public interface RoleController {
	
	@Operation(method = "GET", description = "Get all roles.")
	@ApiResponses({
			@ApiResponse(responseCode = "200", description = "Get roles sucessfully.")})
	@GetMapping(value = "/roles", produces = "application/json")
	public ResponseEntity<List<Role>> getRoles();
	
	@Operation(method = "GET", description = "Get all roles by role name.")
	@Parameter(name = "name")
	@ApiResponses({
		@ApiResponse(responseCode = "200", description = "Get roles sucessfully.")})
	@GetMapping(value = "/roles/{name}", produces = "application/json")
	public ResponseEntity<List<Role>> getRolesByName(@PathVariable("name") String name);
	
	@Operation(method = "POST", description = "Create role and save database.")
	@Parameter(name = "role")
	@ApiResponses({
		@ApiResponse(responseCode = "CREATED", description = "Create successfully"),
		@ApiResponse(responseCode = "415", description = "Create unsucessfully")
	})
	@PostMapping(value = "/create_role")
	public ResponseEntity<Role> createRole(@RequestBody Role role);
	
	@Operation(method = "PUT", description = "Update role and save database.")
	@Parameter(name = "id")
	@PutMapping(value = "/update_role/{id}")
	public ResponseEntity<Role> updateRole(@PathVariable("id") Integer id);
	
	@Operation(method = "Delete", description = "Delete role and save database.")
	@Parameter(name = "id")
	@DeleteMapping(value = "/delete_role/{id}")
	public ResponseEntity<Role> deleteRole(@PathVariable("id") Integer id);
}
