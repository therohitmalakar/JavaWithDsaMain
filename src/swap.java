
public class swap {
    public static void swap(int a, int b){

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a =" +a);
        System.out.println("b =" +b);
    }

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a= 5;
        int b= 10;
        int prod = multiply(a,b);
        System.out.println("a*b :"+prod);
        prod = multiply(10,20);
        System.out.println("a*b ="+prod);
    }

}
