package HW_TasksJava.HW_TasksJava_11_11_22_Garden;

public class Seasons_Tree {
    private String displayName;
    private double height;
    private int age;


    public Seasons_Tree(String displayName, int age) {
        this.displayName = displayName;
        this.age = age;
    }

    public void winter() {
        System.out.println("Winter not a sizon   " + displayName);
    }

    public void spring() {
        this.height = 20.0;
        System.out.println("Spring -- " + displayName + "|  height " + height + "mm");
    }

    public void summer() {
        this.height = 20.0;
        System.out.println("Summer--  " + displayName + "|  height " + height + "mm");
    }

    public void autumn() {
        System.out.println("Autumn not a sizon   " + displayName);
    }
}
