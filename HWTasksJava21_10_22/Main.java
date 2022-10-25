package HW_TasksJava.HWTasksJava21_10_22;


public class Main {
    public static void main(String[] args) {
/*
       todo:
        First level:Создать класс Employee со следующими переменными:
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String position;
        Класс должен содержать конструктор, геттеры, сеттеры, метод toString
        а также метод public String getFullName ().
                Создать и вывести на экран несколько обьектов этого класса*/


        Employee w1 = new Employee(21, "Ann", "Nikollson", 27, "f", "Manager");
        Employee w2 = new Employee(25, "Michael", "Lind", 27, "m", "Programer");
        Employee w3 = new Employee(23, "Amy", "Nicholas", 27, "f", "Engineer");

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println("==========================================================================================");
        System.out.println(w1.getFullName());
        System.out.println(w2.getFullName());
        System.out.println(w3.getFullName());
    }
}
