public class Course {
  static int maxCapacity = 100;
  String courseName;
  int enrolledments;

  String[] enrolledStudents;

  Course(String courseName) {
    this.courseName = courseName;
    this.enrolledments = 0;
    this.enrolledStudents = new String[maxCapacity];
  }

  static void setMaxCapacity(int maxCapacity) {
    Course.maxCapacity = maxCapacity;
  }

  void enrollStudent(String studentName) {
    enrolledStudents[enrolledments] = studentName;
    enrolledments++;
  }

  void unEnrollStudent(String studentName) {
    System.out.println("Student removed");
    enrolledments--;
  }

}
