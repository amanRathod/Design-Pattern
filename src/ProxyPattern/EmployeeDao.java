package ProxyPattern;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
}
