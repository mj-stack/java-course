import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<EmployeeClass> employees = List.of(
                new EmployeeClass("Mukul", 1000),
                new EmployeeClass("Anmol", 2000),
                new EmployeeClass("Varun", 3000),
                new EmployeeClass("Paras", 400),
                new EmployeeClass("Sandeep", 500)
        );

        employees.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
