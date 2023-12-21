import company.Employee;

public class Department {
    private final String nameDepart;
    private Employee[] employees;
    private int currentSize;
    private int maxSize;

    public Department(String nameDepart, Employee[] employees, int currentSize, int maxSize) {
        this.nameDepart = nameDepart;
        this.employees = employees;
        this.currentSize = currentSize;
        this.maxSize = maxSize;
    }

    public String getNameDepart() {
        return nameDepart;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setCurrentSize(int currentSize) {
        if(currentSize != employees.length)
            throw new IllegalArgumentException("Численность работников должна совпадать с числом людей в массиве.");
        this.currentSize = currentSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
