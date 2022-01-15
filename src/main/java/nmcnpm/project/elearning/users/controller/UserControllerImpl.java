package nmcnpm.project.elearning.users.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import nmcnpm.project.elearning.roles.model.Role;
import nmcnpm.project.elearning.users.model.User;
import nmcnpm.project.elearning.users.service.UserService;

@RestController
public class UserControllerImpl implements UserController {
	private UserService service;
	
	public UserControllerImpl(UserService service) {
		this.service = service;
	}

	@Override
	public ResponseEntity<List<User>> getUsers() {
		List<User> users = service.findAll();
		return new ResponseEntity<>(users, HttpStatus.OK); 
	}

	@Override
	public ResponseEntity<List<User>> getUsersByName(String name) {
		List<User> users = service.findByName(name);
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<User> createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Role> updateUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Role> deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
