package BankAccountManagementSystem;
import java.util.ArrayList;

class UserManager {
    // List to store all users
    private ArrayList<User> users;

    // Constructor to initialize the user list
    public UserManager() {
        users = new ArrayList<>();
    }

    // Method to add a new user with detailed information
    public void addUser(String name, int age, String phoneNumber, String email, String address, String bankAccount, String bankName, double initialBalance) {
        User newUser = new User(name, age, phoneNumber, email, address, bankAccount, bankName, initialBalance);
        users.add(newUser);
        System.out.println("User added successfully.");
    }

    // Method to display details of all users
    public void displayAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users available.");
        } else {
            for (User user : users) {
                user.displayUserDetails();
            }
        }
    }

    // Method to find a user by name
    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null; // Returns null if user is not found
    }

    // Method to update the balance of a specific user
    public void updateUserBalance(String name, double amount) {
        User user = findUserByName(name);
        if (user != null) {
            user.updateBalance(amount);
            System.out.println("Balance updated successfully.");
        } else {
            System.out.println("User not found.");
        }
    }
}
