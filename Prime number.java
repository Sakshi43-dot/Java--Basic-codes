public class Main {
    public static void main(String[] args) {
        int num = 29;  // You can change this to any number
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;  // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}