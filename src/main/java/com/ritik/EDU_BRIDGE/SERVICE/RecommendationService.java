package com.ritik.EDU_BRIDGE.SERVICE;

import org.springframework.stereotype.Service;

@Service
public class RecommendationService {

    public String getRecommendation(Long studentId, Long topicId) {
        return "Watch micro-lesson on topic " + topicId;
    }
}
