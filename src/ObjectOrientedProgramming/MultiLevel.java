package ObjectOrientedProgramming;

public class MultiLevel {
    public static void main(String[] args){
    Dog tommy = new Dog();
    tommy.eat();
    tommy.legs = 4;
        System.out.println(tommy.legs);
    }
}
class Animal1{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

class Mamal extends Animal1{
   int legs;
}

class Dog extends Mamal{
    String breed;
}
