package HW_TasksJava.HW_TasksJava16_12_22;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
/*  todo:  First level: Есть массив положительных целых чисел.  Найти элемент (если он есть),
        который  встречается в массиве >length/2 (доминантный элемент). В противном случае вернуть -1*/
         int[] ints ={100, 300,300, 300, 500};
         int[] ints2 ={100, 300, 300, 300, 600, 700};
        System.out.println(elem(ints));
        System.out.println(elem(ints2));// вернуть -1
    }
    public static int elem(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (Integer x : arr) {
            Integer www = map.merge(x, 1, Integer::sum);
            if (www > arr.length / 2) {
                return x;
            }
        }
        return -1;
    }
}
