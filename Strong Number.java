public class Main
{
    public static int factorial(int n){
        int fact =1;
        for(int i=n;i>=1;i--){
	            fact = fact * i;
	        }
	        return fact;
    }
	public static void main(String[] args) {
	    int fact =1,temp,rem,num = 145;
	    temp = num;
	    int strong = 0;
	    while(num>0){
	        rem = num %10;
	        fact = factorial(rem);
	        strong = strong + fact;
	        num = num /10;
	    }
		System.out.println(strong);
		System.out.println(temp);
		System.out.println(temp == strong);
	}
}