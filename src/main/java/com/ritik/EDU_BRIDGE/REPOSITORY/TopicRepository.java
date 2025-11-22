package com.ritik.EDU_BRIDGE.REPOSITORY;

import com.ritik.EDU_BRIDGE.MODEL.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.jaas.JaasPasswordCallbackHandler;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends JpaRepository<Topic,Long> {
 List<Topic> findByCourseId(Long courseId);

}
