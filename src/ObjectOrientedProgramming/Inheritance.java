package ObjectOrientedProgramming;

public class Inheritance {
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

class Fish1 extends Animal{
    int find;
    void swim(){
        System.out.println("swims");
    }
}
