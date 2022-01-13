-- FOREIGN KEY
ALTER TABLE users
ADD CONSTRAINT FK_users_roles FOREIGN KEY (role_id) REFERENCES roles(role_id);

ALTER TABLE courses
ADD CONSTRAINT FK_courses_users FOREIGN KEY (created_by) REFERENCES users(user_id);

ALTER TABLE students_courses
ADD CONSTRAINT FK_students_courses_courses FOREIGN KEY (course_id) REFERENCES courses(course_id);

ALTER TABLE videos
ADD CONSTRAINT FK_videos_courses FOREIGN KEY (course_id) REFERENCES courses(course_id);

ALTER TABLE exercises
ADD CONSTRAINT FK_exercises_courses FOREIGN KEY (course_id) REFERENCES courses(course_id);

ALTER TABLE comments
ADD CONSTRAINT FK_comments_courses FOREIGN KEY (course_id) REFERENCES courses(course_id);

ALTER TABLE comments
ADD CONSTRAINT FK_comments_created FOREIGN KEY (created_by) REFERENCES users(user_id);

-- CHECK
ALTER TABLE exercises 
ADD CONSTRAINT CHECK_DATE_exercises CHECK (created_at <= last_modified);

ALTER TABLE comments
ADD CONSTRAINT CHECK_DATE_comments CHECK (created_at <= last_modified);

ALTER TABLE courses
ADD CONSTRAINT CHECK_COURSESPRICE CHECK (course_price > 0);