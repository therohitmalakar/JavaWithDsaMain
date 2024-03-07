
public class ExceptionHandling {
    public static void main(String[] args){
        try{
            int[] marks = {1,2,3};
            System.out.println(marks[10]);
        }catch(Exception f){
            System.out.println("Something went wrong");
        }finally{
            System.out.println("The try catch is finished");
        }
    }
}
