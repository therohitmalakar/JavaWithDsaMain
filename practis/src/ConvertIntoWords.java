public class ConvertIntoWords {
    public static void inWords(String[] str,int convert){
        if(convert == 0){
            return;
        }
        int lastDigit = convert%10;
        inWords(str,convert/10);
        System.out.print(str[lastDigit]+" ");
    }
    public static void main(String[] args){
        String[] str ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int convert = 1947;
        inWords(str,convert);
    }
}
