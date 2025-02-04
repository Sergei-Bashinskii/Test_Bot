package com.example.testExperimental_bot.repository;

import com.example.testExperimental_bot.model.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

        List<NotificationTask> findByChatIdAndNotificationDateAndNotificationMessage(Long chatId,
                                                                                     LocalDateTime notificationDate,
                                                                                     String notificationMessage);

        @Query(value = "select * from notification_task where notification_date=date_trunc('minute',LOCALTIMESTAMP)"
                , nativeQuery = true)
        List<NotificationTask> getNotificationsForRun();
}
