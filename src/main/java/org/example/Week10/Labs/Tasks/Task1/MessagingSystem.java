package org.example.Week10.Labs.Tasks.Task1;

import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import java.lang.reflect.Method;

public class MessagingSystem {
    public static void main(String[] args) throws NoSuchMethodException {
        RegularUser regularUser = new RegularUser("imran");
        AdminUser adminUser = new AdminUser("becir");

        MessagingSystem messagingSystem = new MessagingSystem();

        messagingSystem.sendMessage(regularUser);
        messagingSystem.sendMessage(adminUser);

    }

    @CanSendMessage
    @RequiresPermission(value = "admin")
    public void sendMessage(User user) throws NoSuchMethodException {
        
        UserPermission userPermission = user.getClass().getAnnotation(UserPermission.class);

        if (!userPermission.value().equals("admin")) {
            System.out.println("User: " + user.getUsername() + " is not allowed to send message");
        }
        else {
            System.out.println("Admin: " + user.getUsername() + " is allowed to send message");
        }
    }
}
