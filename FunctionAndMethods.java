public class FunctionAndMethods {

  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {
    int number = 33;
    System.out.println("Factorial of " + number + ":" + factorial(number));
  }
}
