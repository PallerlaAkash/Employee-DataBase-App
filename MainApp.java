import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        int id = 0;
        String name = "";
        String dept = "";
        double salary = 0.0;

        System.out.println("Enter choice:");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        switch (choice) {
            case 1: // Add Employee
                System.out.print("Enter ID: ");
                id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                name = sc.nextLine();

                System.out.print("Enter Department: ");
                dept = sc.nextLine();

                System.out.print("Enter Salary: ");
                salary = sc.nextDouble();

                Employee emp = new Employee(id, name, dept, salary);
                dao.addEmployee(emp);
                break;

            case 2: // Update Employee
                System.out.print("Enter ID to Update: ");
                id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Name: ");
                name = sc.nextLine();

                System.out.print("Enter New Department: ");
                dept = sc.nextLine();

                System.out.print("Enter New Salary: ");
                salary = sc.nextDouble();

                Employee updatedEmp = new Employee(id, name, dept, salary);
                dao.updateEmployee(updatedEmp);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}