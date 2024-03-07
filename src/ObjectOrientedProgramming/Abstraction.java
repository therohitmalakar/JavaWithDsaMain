package ObjectOrientedProgramming;

public class Abstraction {
    public static void main(String[] args){
        Horse h = new Horse();
            h.eat();
            h.walk();
        System.out.println(h.color);

            Chicken c =new Chicken();
            c.eat();
            c.walk();
    }
}
abstract class Animal4{
    String color;
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
    Animal4(){
        color = "Brown";
    }
}

class Horse extends Animal4{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal4{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}