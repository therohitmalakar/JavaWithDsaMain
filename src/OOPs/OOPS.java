package OOPs;

public class OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen(); //Created a new pen object in heap
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "abcdefg";
        myAcc.setPassword("efghi");
        // The password here cannot be accessed because it is private and we can only change it.
    }
}

//Access Modifier
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
         password = pwd;
    }
}

class Pen {
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
