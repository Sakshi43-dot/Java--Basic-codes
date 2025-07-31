public class Main
{ 
    public static void main(String[]args)
    {
        int num=12,sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0){
                sum=sum+i;
            }
        }

            if(sum>num){
                System.out.println("Abundant Number: "+num);
            }else{
                System.out.println("not a Abundant Number: "+num);
        }
    }
}