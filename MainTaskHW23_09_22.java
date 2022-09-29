package TasksJava;

public class MainTaskHW23_09_22 {
    public static void main(String[] args) {
       /* Second level: Вася рано встает на работу и поэтому рано ложится спать.
        Сосед Васи любит слушать громкую музыку.  У Васи проблемы если сосед слушает
        музыку и еще нет семи утра или уже позже 20 часов. Напишите метод, возвращающий
        true если у Васи проблемы.Где hour - время в часах в диапазоне от 0 до 23*/

        System.out.println(vasiaInTrouble (true, 6));
        System.out.println(vasiaInTrouble (true, 21));

    }
    public static boolean vasiaInTrouble (boolean singing, int hour){

        return singing && hour <7 || hour >20;
    }
}
