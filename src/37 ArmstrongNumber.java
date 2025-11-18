import java.util.Scanner;

 class ArmstrongNumber {
    public static void main(String[] args){
        System.out.println("Welcome to Armstrong Number");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
         int number = input.nextInt();
        boolean isArmstrong = armstrongNumber(number);
        if (isArmstrong){
            System.out.println("your number is Armstrong Number");
        } else {
            System.out.println("Your number is not Armstrong Number");
        }
        System.out.println("no of the digit is: "+ noOfDigit(number));
    }
    public static int noOfDigit( int number){
        int digit = 0;
        while (number > 0 ){
            digit +=1;
            number = number /10;

        }
        return digit;
    }
    public static boolean armstrongNumber(int number){
        int noOfDigit = noOfDigit(number);
        int  sameNumber = number;
         int finalNumber = 0;
        while (number > 0){
            int digit = number % 10;

            number = number / 10;
            finalNumber = finalNumber + power(digit,noOfDigit);

        }
        return finalNumber == sameNumber;
    }
    public static int power(int num1 , int num2){
        int power = num1;
        int i = 1;
        while (i < num2){
            power *= num1;
            i++;
        }
        return power;
    }
}
