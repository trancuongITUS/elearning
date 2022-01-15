package nmcnpm.project.elearning.roles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nmcnpm.project.elearning.roles.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	List<Role> findByName(String name);
}
