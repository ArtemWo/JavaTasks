
public class Main {
    public static void main(String[] args) {
        /*First level: Создать класс "Employee", имеющий:
            - конструктор, который принимает переменные salary, number of  employee's working hours в качестве параметров
            - следующие методы: addSalary() , который добавляет 10 евро к зарплате сотрудника если она меньше 500
    и addWork(), добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
            - создать несколько сотрудников и применить к ним методы*/
        /*Employee person1 = new Employee("Georg", 600, 0);
        Employee person2 = new Employee("Ann", 800, 8);*/

        Employee person1 = new Employee("Jack", 400, 2);
        Employee person2 = new Employee("Georg", 600, 7);
        Employee person3 = new Employee("Ann", 1000, 5);
        Employee[] people = {person1,person2,person3};
        for (int i = 0; i < people.length; i++) {
            printt(people[i]);
        }
    }

    public static void printt(Employee person) {

            System.out.println("Name: " + person.name + " | " + "Working Hours: " + person.workingHours +
                    " | " + "Salary: " + person.salary + " | " + ("Salary: " + person.addSalary()) + " | " +
                    ("Salary: " + person.addWork()));
        }
    }













