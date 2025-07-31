
public class Main {
    public static void main(String[] args) {
        int num = 1331;
        int rem, palindrome = 0;
        int originalNum = num;

        while (num > 0) {
            rem = num % 10;
            palindrome = (palindrome * 10) + rem;
            num /= 10;
        }

        if (originalNum == palindrome) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}