package TasksJava;

public class MainHWTasksJava090922 {
    public static void main(String[] args) {
    /*    //First level:
        System.out.println(isTen(9, 10));
        System.out.println(isTen(9, 8));
        System.out.println(isTen(1, 9));
    }

    //First level:
    private static boolean isTen(int a, int b) {
        //  return ((a+b)==10) || (a==10) || (b==10)?true:false ;     // THE TERNAL METHOD

        if ((a + b) == 10) {
            return true;
        } else if (a == 10) {
            return true;
        }
        if (b == 10) {
            return true;
        }

        return false;
    }
}*/

//______________________________________________________________________________________________________________________
            //Second level:

        num(112,112, 112);
        num(9,15, 13);
        num(12,13, 12);

    }

    private static void num(int a, int b, int c){

        if (a == b || b == c || a == c){
            System.out.println("All numbers are equal" );
        } else if (a != b || b != c || a != c) {
            System.out.println("All numbers are differen");
        } else {
            System.out.println("Some numbers are equal");
        }

        //Вася спит днем если он не работает или у него отпуск. Переменная
        // weekday(рабочий день) =true если это рабочий день, переменная vacation = true
        // если у него отпуск. Написать метод, возвращающий true если Вася спит.

        // isSleeping( boolean weekday, boolean vacation)
        //isSleeping(false,false)->true
        //isSleeping(true,false)->false
        //isSleeping(false,true)->true

    }
    }






