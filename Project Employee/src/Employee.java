

public class Employee {
    double salary;
    double workingHours;
    String name;

    public Employee(String name, double salary, double workingHours) {
        this.salary = salary;
        this.workingHours = workingHours;
        this.name = name;

    }
    public double addSalary(){
        if (salary < 500) {
            salary+=10;
        }
        return salary;
    }

    public double addWork() {
        if (workingHours > 6) {
            salary += 5;
        }
        return salary;
    }
}

