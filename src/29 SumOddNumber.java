import java.util.Scanner;

 class SumOddNumber {
    public static void  main(String[] args){
        System.out.println("Welcome to sum of all the odd Number Calculation");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Number: ");
        int number = input.nextInt();
        int sumodd = sumOddNumber(number);
        System.out.println("sum of the odd number of " + number + " is " + sumodd);
    }
    public static int sumOddNumber(int number) {
        int sum = 0;
        int i = 1;
        while (i <= number) {
           sum = sum + i;
            i +=2;

        }
        return sum;
    };
}
