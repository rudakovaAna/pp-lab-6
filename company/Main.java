package company;

import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000.0, 1, "2022-01-01", "Worker");
        Worker worker2 = new Worker("Alice", 2200.0, 2, "2021-02-01", "Worker");
        Worker worker3 = new Worker("Bob", 1900.0, 3, "2023-03-01", "Worker");
        Worker worker4 = new Worker("Eva", 2050.0, 4, "2022-04-01", "Worker");
        Manager manager1 = new Manager("Michael", 3500.0, 5, "2020-05-01", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager1);

        for (Employee employee : employees) {
            System.out.println("Salary of " + employee.getName() + ": " + employee.getSalary());
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.getId() + 
                               ", Position: " + employee.getPosition() + 
                               ", Hire date: " + employee.getHireDate() + 
                               ", Salary: " + employee.getSalary() + ")");
        }
    }
}
