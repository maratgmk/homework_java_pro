package company;

import java.time.LocalDate;

public abstract class Employee {
    private final String name;
    private final LocalDate date;
    private final double salary;
    private final String department;

    public Employee(String name, LocalDate date, double salary, String department) {
        this.name = name;
        this.date = date;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public abstract void work();
    public abstract void takeBreak();

}
