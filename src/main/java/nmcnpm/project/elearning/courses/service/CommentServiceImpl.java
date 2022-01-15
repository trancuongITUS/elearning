package nmcnpm.project.elearning.courses.service;

import java.util.List;

import org.springframework.stereotype.Service;

import nmcnpm.project.elearning.courses.model.Comment;
import nmcnpm.project.elearning.courses.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	private CommentRepository repository;
	
	public CommentServiceImpl(CommentRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Comment> findAll() {
		return repository.findAll();
	}

	@Override
	public Comment createComment(Comment comment) {
		return repository.save(comment);
	}

	@Override
	public Comment updateComment(Integer id, Comment comment) {
		return repository.save(comment);
	}

	@Override
	public Comment deleteComment(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
