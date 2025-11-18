import java.util.Scanner;

 class SumOfDigit {
    public static void main(String[] args){
        System.out.println("Welcome to Sum of the digit");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = input.nextInt();
         int sumOfDigit = sumOfDigit(number);
        System.out.println(sumOfDigit);

    }
    public static int sumOfDigit(int number){
        int sum = 0;
        while (number >0){
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
