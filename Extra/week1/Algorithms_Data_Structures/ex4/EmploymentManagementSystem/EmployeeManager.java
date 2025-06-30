public class EmployeeManager {
    static Employee[] employees = new Employee[100]; // Max 100 employees
    static int count = 0;

    public static void main(String[] args) {
        addEmployee(new Employee(101, "Alice", "Manager", 75000));
        addEmployee(new Employee(102, "Bob", "Developer", 60000));
        addEmployee(new Employee(103, "Charlie", "Tester", 50000));

        System.out.println("All Employees:");
        traverseEmployees();

        System.out.println("\nSearching for Employee with ID 102:");
        searchEmployee(102);

        System.out.println("\nDeleting Employee with ID 102...");
        deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");
        traverseEmployees();
    }

    public static void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
        } else {
            System.out.println("Employee array is full!");
        }
    }

    public static void searchEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {
                System.out.println("Found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void deleteEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
