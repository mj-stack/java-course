import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });

        queue.offer(new Student("Mukul Joshi", 'A') );
        queue.offer(new Student("Anmol", 'B') );
        queue.offer(new Student("Ram", 'A') );
        queue.offer(new Student("Tom", 'C') );
        queue.offer(new Student("Mark", 'D') );

        System.out.printf("Queue is: %s", queue);
        System.out.println();
        System.out.printf("Got %s \n", queue.poll());
        System.out.printf("Got %s \n", queue.poll());
        System.out.printf("Got %s \n", queue.poll());
        System.out.printf("Got %s \n", queue.poll());
        System.out.printf("Got %s \n", queue.poll());
    }
}
