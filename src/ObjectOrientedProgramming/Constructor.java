package ObjectOrientedProgramming;

public class Constructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Rohit";
        s1.rollNo = 48;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        //System.out.println(s1.name);

        Student s2 = new Student(s1);   //copy
        s2.password = "efg";
        s1.marks[2] = 100;              //change in marks of s1
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int rollNo;
    String password;
    int[] marks;

    // Copy/Shallow copy Constructor

//    Student(Student s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.rollNo = s1.rollNo;
//        this.marks = s1.marks;
//    }

    //Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(){
       // this.name = name;
        marks = new int[3];
        System.out.println("Constructor is called...");
    }
}
