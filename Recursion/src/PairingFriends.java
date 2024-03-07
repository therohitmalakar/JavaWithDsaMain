public class PairingFriends {
    public static int friendsPair(int n){
        if(n==1 || n==2){
           return n;
        }
//        int single = friendsPair(n-1);
//        int pair   = friendsPair(n-2);
//        int pairWays = (n-1) * pair;
//        int totalWays = single + pairWays;
//        return totalWays;
        return friendsPair(n-1) + (n-1) * friendsPair(n-2);
    }
    public static void main(String[] args){
        System.out.println(friendsPair(5));
    }
}
