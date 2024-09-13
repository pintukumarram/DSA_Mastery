import java.util.Scanner;

public class BitwiseOperartors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int num1 = sc.nextInt();

    System.out.println("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.println("Bitwise AND " + (num1 & num2));
    System.out.println("Bitwise OR " + (num1 | num2));
    System.out.println("Bitwise XOR " + (num1 ^ num2));
    System.out.println("Bitwise NOT " + (~num1));
    System.out.println("Bitwise Right-Shift " + (num1 >> 2));
    System.out.println("Bitwise Left-Shift " + (num1 << 2));
    System.out.println("Bitwise Unsigned Right-Shift " + (num1 >>> 2));
    sc.close();
  }
}
