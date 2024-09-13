abstract class Shape{

  //Abstract method
  public abstract double calculateArea();
  public void display(){
    System.out.println("This is shape");
  }
}

class  Circle extends Shape{

  private double radius;

  public Circle(double radius){
    this.radius=radius;
  }

  // @Override
  public double calculateArea(){
    return Math.PI*radius*radius;
  }
}



public class AbstractExample {
  public static void main(String[] args) {
    Circle circle=new Circle(0);
    System.out.println(" Area of circle: "+circle.calculateArea());
    circle.display();
    
  }
}
