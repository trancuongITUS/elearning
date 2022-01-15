package nmcnpm.project.elearning.users.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nmcnpm.project.elearning.courses.model.Comment;
import nmcnpm.project.elearning.courses.model.Course;
import nmcnpm.project.elearning.roles.model.Role;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "fullname")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "username", unique = true)
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "tokens")
	private int token;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "role_id", nullable = false)
	//@JsonBackReference
	@JsonManagedReference
	private Role role;
	
	@OneToMany(mappedBy = "createdBy")
	@JsonBackReference
	private Set<Course> coursesInstructor = new LinkedHashSet<Course>();
	
	@ManyToMany(mappedBy = "students")
	@JsonIgnore
	private Set<Course> coursesStudent = new LinkedHashSet<Course>();
	
	@OneToMany(mappedBy = "createdBy")
	@JsonBackReference
	private Set<Comment> comments = new LinkedHashSet<Comment>();
}
