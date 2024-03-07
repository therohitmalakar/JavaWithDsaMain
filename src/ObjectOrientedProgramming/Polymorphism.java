package ObjectOrientedProgramming;

public class Polymorphism {
    public static void main(String[] args){

        //Function overloading
//        Calculator calc = new Calculator();
//        System.out.println(calc.sum(2,3));
//        System.out.println(calc.sum((float)1.5, (float)2.5));
//        System.out.println(calc.sum(1,2,3));

        //function overriding

        Deer d = new Deer();
        d.eat();
    }
}
//class Calculator{
//
//    int sum(int a, int b){
//        return a+b;
//    }
//    float sum(float a, float b){
//        return a+b;
//    }
//    int sum(int a, int b,int c){
//        return a+b+c;
//}
//}

class Animal3{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer{
    void eat(){
        System.out.println("eats grass");
    }
}