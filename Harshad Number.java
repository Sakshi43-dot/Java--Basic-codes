public class Main
{ 
    public static void main(String[]args)
    {
        int num=21,sum=0;
        int temp = num;
        while(num>0){
            int rem = num %10;
            sum = sum +rem;
            num = num /10;
        }
            if(temp%sum == 0){
                System.out.println("Harshad Number: "+temp);
            }else{
                System.out.println("not a Harshad Number: "+temp);
        }
    }
}