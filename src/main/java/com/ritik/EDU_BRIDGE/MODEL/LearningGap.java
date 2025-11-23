package com.ritik.EDU_BRIDGE.MODEL;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "learning_gaps")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LearningGap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User student;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    private Float gapScore;  // FIXED from Float → Integer

    private String recommendedLesson;

    private LocalDateTime createdAt = LocalDateTime.now();
}
