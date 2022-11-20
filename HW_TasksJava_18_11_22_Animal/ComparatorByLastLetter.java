package HW_TasksJava.HW_TasksJava_18_11_22_Animal;

import HW_TasksJava.HW_TasksJava_18_11_22_Animal.Animal;

import java.util.Comparator;

public class ComparatorByLastLetter implements Comparator<Animal> {

    @Override
    public int compare(Animal an1, Animal an2) {
        String animalname1 =an1.getName();
        String animalname2 =an1.getName();
        return animalname1.charAt(animalname1.length()-1)-animalname2.charAt(animalname2.length()-1);
    }
}
