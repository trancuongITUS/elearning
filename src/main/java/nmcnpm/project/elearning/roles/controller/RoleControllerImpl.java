package nmcnpm.project.elearning.roles.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import nmcnpm.project.elearning.roles.model.Role;
import nmcnpm.project.elearning.roles.service.RoleService;

@RestController
public class RoleControllerImpl implements RoleController {
	private RoleService service;
	
	public RoleControllerImpl(RoleService service) {
		this.service = service;
	}
	
	@Override
	public ResponseEntity<List<Role>> getRoles() {
		List<Role> roles = service.findAll();
		return new ResponseEntity<>(roles, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Role>> getRolesByName(String name) {
		List<Role> roles = service.findByName(name);
		return new ResponseEntity<>(roles, HttpStatus.OK);
	}

}
