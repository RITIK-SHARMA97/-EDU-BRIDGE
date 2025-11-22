package com.ritik.EDU_BRIDGE.MODEL;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Table(name="learning-gaps")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LearningGap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User student;

        @ManyToOne
    private Topic topic;

        private Float gapScore;

        private String recommendedLesson;

        private LocalDateTime createdAt =LocalDateTime.now();

}
