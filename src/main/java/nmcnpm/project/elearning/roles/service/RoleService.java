package nmcnpm.project.elearning.roles.service;

import java.util.List;

import nmcnpm.project.elearning.roles.model.Role;

public interface RoleService {
	List<Role> findAll();
	List<Role> findByName(String name);
}
