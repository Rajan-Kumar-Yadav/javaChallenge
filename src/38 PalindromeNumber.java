import java.util.Scanner;
import java.util.WeakHashMap;

class PalindromeNumber {
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Number");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Number: ");
        int number = input.nextInt();
        boolean isPalindromeNumber = isPalindromeNumber(number);
         if (isPalindromeNumber){
             System.out.println("Your number is palindrome");
         } else {
             System.out.println("Your number is not palindrome");
         }


    }
    public static int reverseNumber(int number){
        int num = 0;
         while (number > 0){
             num = num * 10 + number %10;
             number /=10;

         }
         return num;
    }
    public static boolean isPalindromeNumber(int number){
        int reverseNumber = reverseNumber(number);
        return reverseNumber == number;
    }
}
