public class Student {
  String name = "Mukul Joshi";
  int age = 21;

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }

  public static void main(String[] args) {
    Student student = new Student();
    System.out.println(student.toString());
  }
}
