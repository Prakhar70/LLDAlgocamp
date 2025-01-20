package Solid.Example2.ProblematicCode;

public class UserManager {
    public void add(User user){
        if(user.getAge() < 18){
            throw new IllegalArgumentException("User is not eligible to register");
        }   
        // Code to add user
        System.out.println("User added successfully");
    }
    public void delete(User user){
        // Code to delete user
        System.out.println("User deleted successfully");
    }
    public void update(User user){
        // Code to update user
        System.out.println("User updated successfully");
    }
    public void get(User user){
        // Code to fetch user
        System.out.println("User fetched successfully");
    }
    public void logUserActivity(User user){
        // Code to log user activity
        System.out.println("User activity logged successfully");
    }
}
