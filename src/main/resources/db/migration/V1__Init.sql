CREATE TABLE roles (
	role_id SERIAL,
	role_name VARCHAR(255) UNIQUE,
	role_description VARCHAR(255),
	PRIMARY KEY (role_id)
);

CREATE TABLE users (
	user_id SERIAL,
	fullname VARCHAR(255),
	address VARCHAR(255),
	phone VARCHAR(11),
	email VARCHAR(255) UNIQUE,
	username VARCHAR(255) UNIQUE,
	password VARCHAR(255),
	tokens int,
	role_id int,
	primary key (user_id)
);

CREATE TABLE courses (
	course_id SERIAL,
	course_name VARCHAR(255),
	course_description VARCHAR(255),
	course_price int,
	created_by int,
	created_at TIMESTAMP,
	PRIMARY KEY (course_id)
);

CREATE TABLE videos (
	video_id SERIAL,
	video_name VARCHAR(255),
	video_description VARCHAR(255),
	video_url VARCHAR(255),
	course_id int,
	PRIMARY KEY (video_id)
);

CREATE TABLE exercises (
	exercise_id SERIAL,
	content TEXT,
	solution TEXT,
	created_at TIMESTAMP,
	last_modified TIMESTAMP,
	course_id int,
	PRIMARY KEY (exercise_id)
);

CREATE TABLE comments (
	comment_id SERIAL,
	content TEXT,
	created_by int,
	created_at TIMESTAMP,
	last_modified TIMESTAMP,
	course_id int,
	PRIMARY KEY (comment_id)
);

CREATE TABLE students_courses (
	id SERIAL,
	student_id int,
	course_id int,
	PRIMARY KEY (id)
);