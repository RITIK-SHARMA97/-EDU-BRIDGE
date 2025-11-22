package com.ritik.EDU_BRIDGE.dtos.learninggap;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LearningGapResponse {

    private Long studentId;
    private String studentName;
    private String topicName;
    private Float gapScore;
    private String recommendedLesson;
}
