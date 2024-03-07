public class TilingProblem {
    public static int tiling(int n){
       if(n== 0 || n== 1){
           return 1;
       }
//        //vertical choice
//        int fnm1 = tiling(n-1);
//
//        //horizontal choice
//        int fnm2 = tiling(n-2);
//
//        int totalWays = fnm1 + fnm2;
//        return totalWays;
        return tiling(n-1) + tiling(n-2);
    }
    public static void main(String[] args){
        System.out.println(tiling(7));
    }
}
