package org.example.Week10.Labs.Tasks.Task1;

@UserPermission(value = "admin")
public class AdminUser extends User{
    public AdminUser(String username) {
        super(username);
    }
}
