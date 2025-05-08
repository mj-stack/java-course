public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Mukul Joshi", 21, 2000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Emjay");
        System.out.println(emp.getEmployeeDetails());
    }
}
