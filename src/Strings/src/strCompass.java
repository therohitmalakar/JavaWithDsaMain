public class strCompass {

    public static float getPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //North
            if(dir == 'N'){
                y++;
            }
            //South
            else if( dir == 'S'){
                y--;
            }
            //East
            else if(dir == 'E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }
        int X2 = x*x;     // Here X2 is a whole square of x.
        int Y2 = y*y;

        return (float)(Math.sqrt(X2+Y2));  // Here we used float because sqrt can also give values in decimal.
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";

        System.out.println(getPath(path));
    }
}
