package nmcnpm.project.elearning.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nmcnpm.project.elearning.courses.model.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

}
