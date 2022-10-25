package HW_TasksJava.HW_TasksJava06112022;

public class Main {
    public static void main(String[] args) {
        /*First level: Используя интерфейсы создать классы,  содержащие методы
        для подсчета площади и периметра rectangle and circle, Создать несколько обьектов этих
        типов и вывести  на экран их площадь и периметр*/
        double length = 8.0;
        double breadth = 13.0;
        Rectangle r = new Rectangle(length, breadth);

        System.out.println("Rectangle - Area: " + r.area());
        System.out.println("Rectangle - perimeter: " + r.perimeter());


        double radius = 9.0;
        Circle c = new Circle(radius);
        System.out.println("Circle - Area: " + c.area());
        System.out.println("Circle - perimeter: " + c.perimeter());

    }
}