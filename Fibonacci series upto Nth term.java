import java.util.*;
public class Main 
{
    public static void main(String[]args)
    {
        int num=10;
        int a=0, b=1,nextTerm;
        System.out.print(a+","+b+",");
        for(int i=2;i<num;i++){
            nextTerm = a+b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm+",");
        }
    }
   }