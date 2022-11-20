package HW_TasksJava.HW_TasksJava_18_11_22_Animal;

import HW_TasksJava.HW_TasksJava_18_11_22_Animal.Animal;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Animal> {
    public int compare(Animal an1, Animal an2) {
        return an1.getName().compareTo(an2.getName());
    }


}
