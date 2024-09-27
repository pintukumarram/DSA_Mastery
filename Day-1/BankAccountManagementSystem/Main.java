package BankAccountManagementSystem;
import java.util.*;
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      UserManager userManager = new UserManager();
      int choice;

      do {
          // Display menu
          System.out.println("\nUser Management System:");
          System.out.println("1. Add New User");
          System.out.println("2. Display All Users");
          System.out.println("3. Update User Balance");
          System.out.println("4. Exit");
          System.out.print("Enter your choice: ");
          choice = sc.nextInt();

          switch (choice) {
              case 1:
                  // Add new user
                  System.out.print("Enter user name: ");
                  sc.nextLine(); // Consume newline
                  String name = sc.nextLine();
                  System.out.print("Enter age: ");
                  int age = sc.nextInt();
                  System.out.print("Enter phone number: ");
                  sc.nextLine(); // Consume newline
                  String phoneNumber = sc.nextLine();
                  System.out.print("Enter email: ");
                  String email = sc.nextLine();
                  System.out.print("Enter address: ");
                  String address = sc.nextLine();
                  System.out.print("Enter bank account number: ");
                  String bankAccount = sc.nextLine();
                  System.out.print("Enter bank name: ");
                  String bankName = sc.nextLine();
                  System.out.print("Enter initial balance: ");
                  double balance = sc.nextDouble();

                  userManager.addUser(name, age, phoneNumber, email, address, bankAccount, bankName, balance);
                  break;

              case 2:
                  // Display all users
                  userManager.displayAllUsers();
                  break;

              case 3:
                  // Update user balance
                  System.out.print("Enter user name to update balance: ");
                  sc.nextLine(); // Consume newline
                  String userName = sc.nextLine();
                  System.out.print("Enter amount to add (use negative to deduct): ");
                  double amount = sc.nextDouble();
                  userManager.updateUserBalance(userName, amount);
                  break;

              case 4:
                  // Exit the program
                  System.out.println("Exiting the program. Goodbye!");
                  break;

              default:
                  System.out.println("Invalid choice. Please try again.");
          }
      } while (choice != 4);

      sc.close();
  }
}
