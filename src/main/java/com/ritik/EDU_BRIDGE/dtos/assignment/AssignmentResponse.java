package com.ritik.EDU_BRIDGE.dtos.assignment;

// It’s the acknowledgment or feedback sent back to the frontend after processing.
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AssignmentResponse {
    private String message;
}
