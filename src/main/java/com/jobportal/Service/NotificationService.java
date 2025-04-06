package com.jobportal.Service;

import com.jobportal.DTO.NotificationDTO;
import com.jobportal.Entity.Notification;
import com.jobportal.Exception.JobPortalException;

import java.util.List;

public interface NotificationService {
    public void sendNotification(NotificationDTO notificationDTO) throws JobPortalException;
    public List<Notification> getUnreadNotifications(Long userId);
    public void readNotification(Long id) throws JobPortalException;
}
