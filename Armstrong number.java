import java.util.*;
public class Main 
{
    public static void main(String[]args)
    {
        int num = 153;
        double sum =0;
         int rem;
        int temp = num;
        while(num>0){
        rem = num%10;
        sum = sum + Math.pow(rem,3);
        num = num/10;
        }
        if(temp == sum){
            System.out.println(sum+ " is armstrong number");
        }else{
            System.out.println(sum+ " is not armstrong number");
        }
    }
}