package HW_TasksJava.HW_TasksJava_11_11_22_Garden;

public class Main {
    public static void main(String[] args) {
       /*  todo: Выращиваем деревья и цветы. Каждый из этих видов имеет
            следующие характеристики: displayName,height, age. Каждый из них
            вырастает за сезон на разную высоту, одинаковую для всех деревьев и всех цветов.
            --------------------------------------------
            Каждый сезон состоит из 4 времен года, в которые цветы и деревья ведут себя не всегда одинаково.
            Сезон для цветов начинается весной, летом они не растут а цветут, осенью  их срезают, зимой они не растут.
            Для деревьев: сезон начинается весной, летом растут, осенью не растут,  зимой они не растут.
            -------------------------------------------------
            В классе Garden  создать метод growPlants, в котором  отражен процесс  роста нескольких растений  в течение
            нескольких лет.
            (что происходит зимой, летом и весной, их размер в каждый сезон и какого они размера и возраста в конце.)
            Решить задачу через абстрактные классы! */
        Seasons_Flowers seasons_flowers1 = new Seasons_Flowers("Chamomile  ", 1);

        Seasons_Tree seasons_Tree1 = new Seasons_Tree("Fir  ", 1);

        System.out.println("============Treee================");
        seasons_Tree1.winter();
        seasons_Tree1.spring();
        seasons_Tree1.summer();
        seasons_Tree1.autumn();
        System.out.println("===============Flowers===============");
        seasons_flowers1.winter();
        seasons_flowers1.srring();
        seasons_flowers1.summer();
        seasons_flowers1.autumn();
    }

}
