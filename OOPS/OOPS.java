
class Student {
  private String name;
  private int age;
  private char grade;

  public Student(String name, int age, char grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  public void Display() {
    System.out.println("Name " + name);
    System.out.println("Age " + age);
    System.out.println("Grade " + grade);

  }
}

public class OOPS {
  public static void main(String[] args) {
    Student student = new Student("jOHN", 24, 'A');
    Student student2=new Student("Alice cal", 26, 'B');
    student.Display();
    student2.Display();
  }
}
