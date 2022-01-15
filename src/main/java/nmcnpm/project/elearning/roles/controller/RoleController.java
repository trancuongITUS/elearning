package nmcnpm.project.elearning.roles.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
