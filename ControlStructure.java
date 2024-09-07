// 1.1 Write a program to find the largest of three numbers using if-else.
// 1.2 Implement a simple menu using a switch statement.

public class ControlStructure {
  public static void main(String[] args) {
    int num1 = 10, num2 = 71, num3 = 9;
    int largest; //This variable is used to store the value
    System.out.println("Checking the largest of three numbers from num1,num2,num3: ");
    if (num1 > num2) {
      largest = num1;
      System.out.println("Largest number is " + largest);
    } else if (num2 > num3) {
      largest = num2;
      System.out.println("Largest number is " + largest);
    } else {
      System.out.println("Largest number is " + num3);
    }

  }
}
