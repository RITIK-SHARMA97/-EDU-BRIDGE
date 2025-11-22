package com.ritik.EDU_BRIDGE.REPOSITORY;

import com.ritik.EDU_BRIDGE.MODEL.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
