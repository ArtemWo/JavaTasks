package HW_TasksJava.HW_TasksJava_Employee_Comparable;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
 /*todo:
           Есть класс Employee  с полями  id, name, age, salary.
           Сделать его comparable по id,    сделать дополнительные
           возможности сортировки по: salary, age, name,  а также компаратор
           ageAndThenName ( в этом случае сортировка происходит по возрасту,
            но если возраст одинаковый то   сортируется  по имени. Т.е. в случае Антон,22года и Елена 22 года
            сначала в списке будет идти Антон).
            Создать лист таких сотрудников и вывести его на экран, отсортированный в соответствии с вышеуказанными способами.
            Для сортировки использовать метод   Collections.sort
                =======================================*/

        Employee employee1 = new Employee(4, "Sophia", 20, 4800);
        Employee employee2 = new Employee(1, "Jenny", 27, 2890);
        Employee employee3 = new Employee(3, "Ashley", 22, 3250);
        Employee employee4 = new Employee(2, "Emma", 34, 1230);
        Employee employee5 = new Employee(5, "Sandra", 20, 1000);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);


        Collections.sort(employees);

        System.out.println("============== Id =============");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = (Employee) employees.get(i);
            System.out.println("Employee id = " + employee.getEmployeeId());
        }
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee name1, Employee name2) {
                return name1.getName().compareTo(name2.getName());
            }
        });
        System.out.println("============== Name =============");
        for (int e = 0; e < employees.size(); e++) {
            Employee employee = (Employee) employees.get(e);
            System.out.println("Employee Name = " + employee.getName());
        }
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee salary1, Employee salary2) {
                return salary1.getSalary() - salary2.getSalary();
            }
        });
        System.out.println("============== Salary =============");
        for (int e = 0; e < employees.size(); e++) {
            Employee employee = (Employee) employees.get(e);
            System.out.println("Employee Salary = " + employee.getSalary());
        }
        Collections.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee age1, Employee age2) {
                return age1.getAge() - age2.getAge();
            }
        });
        System.out.println("============== Age =============");
        for (int e = 0; e < employees.size(); e++) {
            Employee employee = (Employee) employees.get(e);
            System.out.println("Employee Name = " + employee.getAge());
        }
    }
}

