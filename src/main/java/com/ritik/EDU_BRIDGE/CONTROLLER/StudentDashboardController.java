package com.ritik.EDU_BRIDGE.CONTROLLER;


import com.ritik.EDU_BRIDGE.REPOSITORY.LearningGapRepository;
import com.ritik.EDU_BRIDGE.dtos.learninggap.LearningGapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/student")
public class StudentDashboardController {

    @Autowired
    private LearningGapRepository gapRepo;

    @GetMapping("/dashboard/{studentId}")
    public List<LearningGapResponse> getDashboard(@PathVariable Long studentId) {
        return gapRepo.findByStudentId(studentId).stream().map(gap -> new LearningGapResponse(
                gap.getStudent().getId(),
                gap.getStudent().getName(),
                gap.getTopic().getName(),
                gap.getGapScore(), gap.getRecommendedLesson()
        )).collect(Collectors.toList());
    }
}
