package HW_TasksJava.HW_TasksJava_18_11_22_Animal;

import java.util.Arrays;

public class AnimalMain {
    public static void main(String[] args) {
  /*  todo; создать класс Animal  с полями name , weight, colour  и вывести на экран
             списки животных упорядоченные 1. по имени,2. по весу  3. список названий
             животных, упорядоченный по возрастанию последней буквы названия.
             Использовать компараторы
       1.   name                     \      2.    weight                      \      3.    Wolf
          Bear 500, brown        \          Wolf, 100,grey                \        Bear
          Wolf, 100,grey           \         Bear 500, brown               \              */

        Animal animalBear = new Animal("Bear", 500, "brown");
        Animal animalWolf = new Animal("Wolf", 100, "grey");
        System.out.println("=======================By Name=========================");
        Animal[] animals = {animalBear, animalWolf};
        Arrays.sort(animals, new ComparatorByName());
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
        }
        System.out.println("=====================ByWeight================================");
        Arrays.sort(animals, new ComparatorByWeight());
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
        }
        System.out.println("====================By Last Letter=============================");
        Arrays.sort(animals, new ComparatorByLastLetter());
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());


        }
    }
}

