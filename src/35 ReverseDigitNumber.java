import java.util.Scanner;

 class ReverseDigitNumber {
    public static void main(String[] args){
        System.out.println("Welcome to Reverse the digit of a Number");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Number: ");
        int number = input.nextInt();
          int reverseDigit = reverseDigit(number);
        System.out.println("Your reverseDigit is: " + reverseDigit);
    }
    public static int reverseDigit(int number){
        int sum = 0;
        while (number > 0){
            sum = sum * 10 + number % 10;
            number = number / 10;
        }
        return  sum;
    }
}
