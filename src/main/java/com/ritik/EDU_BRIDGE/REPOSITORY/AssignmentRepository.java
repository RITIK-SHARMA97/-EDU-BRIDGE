package com.ritik.EDU_BRIDGE.REPOSITORY;

import com.ritik.EDU_BRIDGE.MODEL.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findByStudentId(Long studentId);
}
