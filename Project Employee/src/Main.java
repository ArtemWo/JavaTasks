
public class Main {
    public static void main(String[] args) {
        /*First level: ������� ����� "Employee", �������:
            - �����������, ������� ��������� ���������� salary, number of  employee's working hours � �������� ����������
            - ��������� ������: addSalary() , ������� ��������� 10 ���� � �������� ���������� ���� ��� ������ 500
    � addWork(), ����������� 5 ���� � �������� ���������� ���� ���������� �����  ������ 6.
            - ������� ��������� ����������� � ��������� � ��� ������*/
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













