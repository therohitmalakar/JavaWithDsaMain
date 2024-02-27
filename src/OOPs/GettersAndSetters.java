package OOPs;

public class GettersAndSetters {
    public static void main(String[] args){
        Pen2 p1 = new Pen2();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen2 {
    private String color;
    private int tip;

    String getColor(){            //getters
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){  //setters
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}

