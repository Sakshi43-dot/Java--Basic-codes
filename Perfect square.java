public class Main 
{ 
    public static void main(String[] args)
    {
        int num = 26;
        int sqrt = (int)Math.sqrt(num);  // Get integer part of square rootif (sqrt * sqrt == num)
        if(sqrt * sqrt == num)
        {
            System.out.println("Perfect square: " + num);   
        }
        else
        {
            System.out.println("Not a Perfect square: " + num); 
        }
    }
}