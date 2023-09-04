import java.util.*;

class Employee {
    String employeeID;
    String name;
    int age;
    double salary;

    public Employee(String employeeID, String name, int age, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return employeeID + " " + name + " " + age + " " + salary;
    }
}

public class asss {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("161E90", "Raman", 41, 56000));
        employeeList.add(new Employee("161F91", "Himadri", 38, 67500));
        employeeList.add(new Employee("161F99", "Jaya", 51, 82100));
        employeeList.add(new Employee("171E20", "Tejas", 30, 55000));
        employeeList.add(new Employee("171G30", "Ajay", 45, 44000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sorting parameter:");
        System.out.println("1. Age");
        System.out.println("2. Name");
        System.out.println("3. Salary");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(employeeList, Comparator.comparingInt(employee -> employee.age));
                break;
            case 2:
                Collections.sort(employeeList, Comparator.comparing(employee -> employee.name));
                break;
            case 3:
                Collections.sort(employeeList, Comparator.comparingDouble(employee -> employee.salary));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Sorted Employee Table:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
