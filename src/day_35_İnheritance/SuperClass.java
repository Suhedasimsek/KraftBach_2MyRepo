package day_35_─░nheritance;

public class SuperClass {
    int x;
    String str;
    public SuperClass (){
        System.out.println("Superclass constructor");
    }

    public SuperClass(int x, String str) {
        this.x = x;
        this.str = str;
        System.out.println("Parametreli constructor");
    }
}
