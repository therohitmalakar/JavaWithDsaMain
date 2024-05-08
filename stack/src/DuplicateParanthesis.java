import java.util.*;
import java.util.Stack;

public class DuplicateParanthesis {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            //closing
            if(c == ')'){
                int count =0;
                while(s.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true;
                }
            }
            else{
                s.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args){
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isValid(str));
    }
}
