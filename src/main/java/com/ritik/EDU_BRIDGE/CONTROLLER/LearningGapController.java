package com.ritik.EDU_BRIDGE.CONTROLLER;

import com.ritik.EDU_BRIDGE.REPOSITORY.LearningGapRepository;
import com.ritik.EDU_BRIDGE.dtos.learninggap.LearningGapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/teacher")
public class LearningGapController {


    @Autowired
    private LearningGapRepository gapRepo;

    @GetMapping("/learning-gaps")
    public List<LearningGapResponse> getAllGaps(){
        return gapRepo.findAll().stream().map(gap->new LearningGapResponse(
                gap.getStudent().getId(),
                gap.getStudent().getName(),
                gap.getTopic().getName(),
                gap.getGapScore(),
                gap.getRecommendedLesson()
        )).collect(Collectors.toList());
    }















}
