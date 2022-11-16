package HW_TasksJava.HW_TasksJava_11_11_22_Garden;

public class Seasons_Flowers {
    private String displayName;
    private double height;
    private int age;
    private String flowerBlooming;
    private String flowerCut;


    public Seasons_Flowers(String displayName, int age) {
        this.displayName = displayName;
        this.age = age;
    }

    public void winter() {
        System.out.println("Winter not a sizon    " + displayName);
    }

    public void srring() {
        this.height = 150;
        System.out.println("Srring -- " + displayName + " | height " + height + "mm");
    }

    public void summer() {
        this.flowerBlooming =" flowerBlooming";
        System.out.println("Summer--  " + displayName + " | height " + height + "mm |" + flowerBlooming);
    }

    public void autumn() {
        this.flowerCut = "flowerCut";
        System.out.println("Autumn -- " + displayName + " | " + flowerCut);
    }

}

