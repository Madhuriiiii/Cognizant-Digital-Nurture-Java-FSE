package com.cognizant;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class NotificationManagerTest {

    @Test
    public void testNotification() {

        NotificationService service = mock(NotificationService.class);

        NotificationManager manager = new NotificationManager(service);

        manager.notifyUser("Welcome");

        verify(service, times(1)).sendNotification("Welcome");

        verify(service, never()).sendNotification("Hello");
    }
}