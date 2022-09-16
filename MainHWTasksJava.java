package HW;

public class MainHWTasksJava {
    public static void main(String[] args) {
        /*Second level: C помощью оператора if написать метод,
         принимающий целое число n и вывод€щий на экран надпись
         €вл€етс€ ли оно положительным , отрицательным или нулем.*/
        System.out.println(sum(2, 2));
        System.out.println(sum(3, 2));
    }

    public static int sum(int a, int b){
        int summ = a + b;

        if (a==b){
            summ = summ *2;
        }
        return summ;
    }
}