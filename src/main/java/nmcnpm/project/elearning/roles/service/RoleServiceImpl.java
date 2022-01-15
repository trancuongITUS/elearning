package nmcnpm.project.elearning.roles.service;

import java.util.List;

import org.springframework.stereotype.Service;

import nmcnpm.project.elearning.roles.model.Role;
import nmcnpm.project.elearning.roles.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	private RoleRepository repository;
	
	public RoleServiceImpl(RoleRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Role> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Role> findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public Role create(Role role) {
		return repository.save(role);
	}

}
