public class Main
{ 
    public static void main(String[]args)
    {
        int num=32,sum=0,temp;
        temp=num;
        for(int i=1; i<=num/2; i++)
        {
            if(num%i==0)
            {
                sum = sum+i;
            }
        }
        if (sum==num)
        System.out.println("Perfect number:"+ sum);
        else
            {
                System.out.println("Not a Perfect number:"+ sum);    
            }
    }
	
}