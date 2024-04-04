public class Subset {

    public static void printSubset(String str, String sets, int i){
        if(i == str.length()){
            System.out.println(sets);
            return;
        }

        printSubset(str, sets+str.charAt(i), i+1);
        printSubset(str, sets, i+1);
    }
    public static void main(String[] args) {

        String str = "abc";
        printSubset(str,"",0);
    }
}
