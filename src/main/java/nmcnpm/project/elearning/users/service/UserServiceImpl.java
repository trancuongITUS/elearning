package nmcnpm.project.elearning.users.service;

import java.util.List;

import org.springframework.stereotype.Service;

import nmcnpm.project.elearning.users.model.User;
import nmcnpm.project.elearning.users.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository repository;
	
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public List<User> findByName(String name) {
		return repository.findByName(name);
	}


}
