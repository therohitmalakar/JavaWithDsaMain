public class circFunc {
    public static float calCircum(int r){

        float pi = 22/7;

        float circum = 2*pi*r;
        return circum;

    }

    public static void main(String[] args) {
        System.out.println("the circumference is " + calCircum(5));
    }
}
