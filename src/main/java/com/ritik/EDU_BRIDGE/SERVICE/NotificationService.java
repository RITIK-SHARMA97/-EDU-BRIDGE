package com.ritik.EDU_BRIDGE.SERVICE;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Scheduled(fixedRate = 60000) // every 60 seconds
    public void sendNotifications() {
        // Future: send email/SMS/push notifications
    }
}
