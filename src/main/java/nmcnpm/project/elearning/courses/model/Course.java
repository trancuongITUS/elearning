package nmcnpm.project.elearning.courses.model;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nmcnpm.project.elearning.users.model.User;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private int id;
	
	@Column(name = "course_name")
	private String name;
	
	@Column(name = "course_description")
	private String description;
	
	@Column(name = "course_price")
	private int price;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "created_by", nullable = false)
	@JsonBackReference
	private User createdBy;
	
	@CreatedDate
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "students_courses",
			joinColumns = @JoinColumn(name = "course_id"),
			inverseJoinColumns = @JoinColumn(name = "student_id"))
	@JsonIgnore
	private Set<User> students = new LinkedHashSet<User>();
	
	@OneToMany(mappedBy = "course")
	@JsonManagedReference
	private Set<Exercise> exercises = new LinkedHashSet<Exercise>();
	
	@OneToMany(mappedBy = "course")
	@JsonManagedReference
	private Set<Video> videos = new LinkedHashSet<Video>();
	
	@OneToMany(mappedBy = "course")
	@JsonManagedReference
	private Set<Comment> comments = new LinkedHashSet<Comment>();
}
