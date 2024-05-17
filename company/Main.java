package company;

import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000.0, 1);
        Worker worker2 = new Worker("Alice", 2200.0, 2);
        Worker worker3 = new Worker("Bob", 1900.0, 3);
        Worker worker4 = new Worker("Eva", 2050.0, 4);
        Manager manager1 = new Manager("Michael", 3500.0, 5);

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager1);

        for (Employee employee : employees) {
            System.out.println("Salary of " + employee.getName() + ": " + employee.getSalary());
            employee.work();
        }
    }
}
