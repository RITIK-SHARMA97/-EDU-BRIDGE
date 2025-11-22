package com.ritik.EDU_BRIDGE.REPOSITORY;

import com.ritik.EDU_BRIDGE.MODEL.LearningGap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LearningGapRepository extends JpaRepository<LearningGap,Long> {
    List<LearningGap> findByStudentIs(Long studentId);
    List<LearningGap> findByTopicId(Long topicId);

}
