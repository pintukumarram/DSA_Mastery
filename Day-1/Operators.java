
// Write a program to take two integers as input and print their sum,difference,product and quotient
import java.util.Scanner;

public class Operators {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first integer: ");
    int num1 = sc.nextInt();
    System.out.println("Enter second integer: ");
    int num2 = sc.nextInt();
    int sum = 0;
    sum = num1 + num2;
    System.out.println("Sum of num1 and num2 is :" + sum);
    int Product = num1 * num2;
    System.out.println("Product of num1 and num2 is " + Product);
    int differece = num2 - num1;
    System.out.println("Difference of num1 and num2 is :" + differece);
    double quotient = num1 / num2;
    System.out.println("Quotient of num1 and num2 is " + quotient);
    sc.close();
  }
}