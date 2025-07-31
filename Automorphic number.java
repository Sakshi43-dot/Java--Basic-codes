public class Main
{ 
    public static void main(String[]args)
    {
        int num=76;
        int square= num * num;
        int temp=num;
        int count = 0;
        
        while(temp >0){
            
            count = count + 1;
            temp = temp /10;
        }
        int multi = 1;
        for(int i=1; i<=count; i++){
            multi = 10 * multi;
        }
        if(square%multi == num)
        {
            System.out.println("Automorphic : " + num);   
        }
        else{
            System.out.println("Not a Automorphic : " + num); 
        }


    }
}