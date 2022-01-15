package nmcnpm.project.elearning.users.service;

import java.util.List;

import nmcnpm.project.elearning.users.model.User;

public interface UserService {
	public List<User> findAll();
	public List<User> findByName(String name);
}
