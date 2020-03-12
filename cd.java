import java.util.*;
class cd{
    static Scanner scn = new Scanner(System.in);
    public static void main(String []args){
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int div = scn.nextInt();
        
        int count = 0;
        for(int i=num1; i<=num2; i++){
            if(i % div==0){
                count ++;
            }
        }
        System.out.println(count);
    }
}