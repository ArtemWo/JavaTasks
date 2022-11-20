package HW_TasksJava.HW_TasksJava_Employee_Comparable;

public class Employee implements Comparable {
    private int employeeId;
    private String name;
    private int age;
    private int salary;

    public Employee(int employeeId, String name, int age, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        return (this.employeeId < employee.employeeId) ? -1 :
                (this.employeeId < employee.employeeId) ? 1 : 0;
    }
}
