public class LengthofStr{

    public static int countLength(String str,int i){
        if(i == str.length()){
            return i;
        }
        return countLength(str,i+1);
    }
    public static void main(String[] args){
        String str = "abcde";
        System.out.println(countLength(str,0));
    }
}
