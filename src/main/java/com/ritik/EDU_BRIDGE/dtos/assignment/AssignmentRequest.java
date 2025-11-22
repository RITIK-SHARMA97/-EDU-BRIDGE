package com.ritik.EDU_BRIDGE.dtos.assignment;

//It’s the input packet for recording student assignments.
import lombok.Data;

@Data
public class AssignmentRequest {
    private Long studentId;
    private Long topicId;
    private float score;

}
