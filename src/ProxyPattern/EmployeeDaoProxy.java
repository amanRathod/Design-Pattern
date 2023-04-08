package ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoProxy implements EmployeeDao {
    private EmployeeDao employeeDao;
    private AccessControl accessControl;

    EmployeeDaoProxy(AccessControl accessControl) {
        this.accessControl = accessControl;
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public List<Employee> getAllEmployees() {
        if (accessControl.isAuthorized()) {
            return employeeDao.getAllEmployees();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        if (accessControl.isAuthorized()) {
            employeeDao.addEmployee(employee);
        }
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {

    }
}
