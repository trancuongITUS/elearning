ALTER TABLE students_courses
ADD CONSTRAINT FK_students_courses_users FOREIGN KEY (student_id) REFERENCES users(user_id);