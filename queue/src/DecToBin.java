import java.util.*;
public class DecToBin {

    public static void getBin(Queue<Integer> q , int n ) {
        for(int i=0; i<n; i++){
            int curr = i;
            while (curr > 0) {
                q.add(curr % 2);
                curr = curr / 2;
            }
        }
    }

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        int n = 5;
        getBin(q,n);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
