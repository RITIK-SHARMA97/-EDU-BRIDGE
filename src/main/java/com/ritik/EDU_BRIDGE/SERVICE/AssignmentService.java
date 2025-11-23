package com.ritik.EDU_BRIDGE.SERVICE;

import com.ritik.EDU_BRIDGE.MODEL.Assignment;
import com.ritik.EDU_BRIDGE.MODEL.LearningGap;
import com.ritik.EDU_BRIDGE.MODEL.Topic;
import com.ritik.EDU_BRIDGE.MODEL.User;

import com.ritik.EDU_BRIDGE.REPOSITORY.AssignmentRepository;
import com.ritik.EDU_BRIDGE.REPOSITORY.LearningGapRepository;
import com.ritik.EDU_BRIDGE.REPOSITORY.TopicRepository;
import com.ritik.EDU_BRIDGE.REPOSITORY.UserRepository;

import com.ritik.EDU_BRIDGE.dtos.assignment.AssignmentRequest;
import com.ritik.EDU_BRIDGE.dtos.assignment.AssignmentResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepo;

    @Autowired
    private LearningGapRepository gapRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private TopicRepository topicRepo;

    @Autowired
    private RecommendationService recService;


    public AssignmentResponse submitAssignment(AssignmentRequest request) {

        User student = userRepo.findById(request.getStudentId()).orElseThrow();
        Topic topic = topicRepo.findById(request.getTopicId()).orElseThrow();

        // Save assignment
        Assignment assignment = new Assignment();
        assignment.setStudent(student);
        assignment.setTopic(topic);
        assignment.setScore(request.getScore());
        assignmentRepo.save(assignment);

        // Calculate gap
        float gapScore = 100 - request.getScore();

        if (gapScore > 20) {
            LearningGap gap = new LearningGap();
            gap.setStudent(student);
            gap.setTopic(topic);
            gap.setGapScore(gapScore);
            gap.setRecommendedLesson(
                    recService.getRecommendation(student.getId(), topic.getId())
            );
            gapRepo.save(gap);  // ✔ FIXED: missing save
        }

        return new AssignmentResponse("Assignment submitted and learning gap processed");
    }
}
