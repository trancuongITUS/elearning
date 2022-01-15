package nmcnpm.project.elearning.courses.service;

import java.util.List;


import nmcnpm.project.elearning.courses.model.Comment;

public interface CommentService {
	public List<Comment> findAll();
	public Comment createComment(Comment comment);
	public Comment updateComment(Integer id, Comment comment);
	public Comment deleteComment(Integer id);
}
