import java.util.Scanner;;

public class SimpleMenu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    double num1, num2, result;

    // Displayin menu:
    System.out.println("1. Addition ");
    System.out.println("2. Subtraction ");
    System.out.println("3. Multplication ");
    System.out.println("4. Division ");
    System.out.println("5. Exit");

    System.out.println("Enter choices (1-5) ");
    choice = sc.nextInt();

    switch (choice) {
      case 1:
        System.out.println("Enter two numbers: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        result = num1 + num2;
        System.out.println("Result " + result);
        break;

      case 2:
        System.out.println("Enter two numbers: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        result = num2 - num1;
        System.out.println("Result " + result);
        break;

      case 3:
        System.out.println("Enter two numbers :");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        result = num1 * num2;
        break;

      case 4:
        System.out.println("Enter two numbers :");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        if (num2 != 0) {
          result = num1 / num2;
          System.out.println("Result " + result);
        } else {
          System.out.println("Error : Division by zero is not allowed. ");
        }
        break;

      case 5:
        System.out.println("Exiting the menu! Goodbye!");
        break;

      default:
        System.out.println("Invalid choice. Please select an option from 1 to 5.");
    }
    sc.close();
  }
}
