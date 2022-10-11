public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.add();
        employeeManager.list();
        employeeManager.bestEmployee();

        customerManager.add();
        customerManager.list();
    }
}

