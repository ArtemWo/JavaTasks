package HW_TasksJava.HW_TasksJava25_11_22_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    /*todo:Есть лист  целых чисел. Написать метод, который вернет список без элементов, больше числа n.
       public List withoutElementsMoreThanN(List ints, int n)  */
        
        List<Integer> listNum = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(withoutElementsMoreThanN(listNum,2));
    }

    public static List<Integer> withoutElementsMoreThanN(List<Integer> ints, int n) {
        List<Integer> element = new ArrayList<>();
        for (int i = 0; i <ints.size() ; i++) {
            if (ints.get(i) >= n) {
                element.add(ints.get(i));
            }
        }
        return element;
    }
}









           
