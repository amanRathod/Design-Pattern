package ProxyPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccessControl accessControl = new AccessControl(true);
        EmployeeDao employeeDao = new EmployeeDaoProxy(accessControl);

        // Get all employees
        List<Employee> employees = employeeDao.getAllEmployees();
        System.out.println("All employees: " + employees);
    }
}
