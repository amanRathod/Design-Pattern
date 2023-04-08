package ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private List<Employee> employees;

    public EmployeeDaoImpl() {
        employees = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("John");
        employee1.setDepartment("IT");
        employees.add(employee1);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {

    }
}
