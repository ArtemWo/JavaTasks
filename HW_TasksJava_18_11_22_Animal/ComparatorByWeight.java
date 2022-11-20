package HW_TasksJava.HW_TasksJava_18_11_22_Animal;

import HW_TasksJava.HW_TasksJava_18_11_22_Animal.Animal;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getWeight()- o2.getWeight();
    }
}
