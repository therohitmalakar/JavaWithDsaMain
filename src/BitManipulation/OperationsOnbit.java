package BitManipulation;

public class OperationsOnbit {

    public static int getIthBit(int n, int i){

        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit){
//        if(newBit == 0){
//            return clearIthBit(n,i);
//        }else{
//            return setIthBit(n,i);
//        }
        n = clearIthBit(n,i);
        int bitmask = newBit<<i;
        return n | bitmask;

    }
    public static int clearIbits(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearRangeOfBits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args){
        System.out.println(clearRangeOfBits(10,2, 4));
    }
}
