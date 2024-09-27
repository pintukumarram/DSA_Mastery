public class MethodScopeExample {


  static int addTwo(int a,int b){
    // System.out.println(z);
    String name="XYZ";
    System.out.println(name);
    return a+b;
        }
  public static void main(String[] args) {
    // System.out.println("Value of x is " + x);  This is give compilation error as value of x is not accessible here

    int x = 10;

    System.out.println("Value of x = " + x);

int sum=addTwo(7, 8);
System.out.println(sum);


  }
}
