public class Main
{ 
    public static int abundancy(int num){
        int sum=0;
       for(int i=1;i<=num;i++)
       {
           if(num%i==0)
           {
               sum=sum+i;
           }
       }
       int abund = sum/num;
       return abund;
    }
    public static void main(String []args){
    int num1= 6;
    int num2=28;
    System.out.println(abundancy(num2));
    System.out.println(abundancy(num1));
    if(abundancy(num1) == abundancy(num2)){
        System.out.println("Friendly pair : " + num1+","+num2);
    }
    else
    {
                System.out.println("Not a Friendly pair: " + num1+","+num2);
    }
}
}