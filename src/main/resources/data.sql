-- Reset sequences
ALTER SEQUENCE users_id_seq RESTART WITH 10;
ALTER SEQUENCE course_id_seq RESTART WITH 10;
ALTER SEQUENCE topic_id_seq RESTART WITH 10;

-- Users
INSERT INTO users (id, name, email, password, role, created_at)
VALUES
(1, 'Admin User', 'admin@gmail.com',
 '$2a$10$uBxn0mpNcdHZDi5YLMqGzeeZslv8Z.wdzTfzAWJISi0oIwB3bHz5e',
 'ADMIN', NOW()),
(2, 'Teacher One', 'teacher@gmail.com',
 '$2a$10$uBxn0mpNcdHZDi5YLMqGzeeZslv8Z.wdzTfzAWJISi0oIwB3bHz5e',
 'TEACHER', NOW()),
(3, 'Student One', 'student@gmail.com',
 '$2a$10$uBxn0mpNcdHZDi5YLMqGzeeZslv8Z.wdzTfzAWJISi0oIwB3bHz5e',
 'STUDENT', NOW());

-- Course
INSERT INTO course (id, name, description)
VALUES (1, 'Mathematics', 'Class 6 complete curriculum');

-- Topics
INSERT INTO topic (id, course_id, name, description)
VALUES
(1, 1, 'Fractions', 'Understanding fractions'),
(2, 1, 'Decimals', 'Decimal basics and operations');
