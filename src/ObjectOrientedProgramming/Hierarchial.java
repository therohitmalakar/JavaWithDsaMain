package ObjectOrientedProgramming;

public class Hierarchial {
    public static void main(String[] args){
        Bird parrot = new Bird();
        parrot.eat();

    }
}
class Animal2{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }

}
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }

}
