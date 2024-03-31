import java.text.ParseException;
public class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) throws ParseException {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: $" + salary);
        displayPersonName(); // Calling displayPersonName() method from the Person class
        displayAge(); // Calling displayAge() method from the Person class
    }

    public static void main(String[] args) throws ParseException {
        Employee employee = new Employee("John Doe", "01-01-1990", 1001, 60000);
        employee.displayEmployeeDetails();
    }
}