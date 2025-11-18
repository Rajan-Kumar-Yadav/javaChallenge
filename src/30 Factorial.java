import java.util.Scanner;

 class Factorial {
    public static void main(String[] args){
        System.out.println("Welcome to factorial calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = input.nextInt();
        long factorial = factorial(number);
        System.out.println( " = "+factorial);


    }
    public static long factorial(int number){
         int fact = 1;
        int i = 1;
        while (i <= number){

            System.out.print(i+ " X ");
            fact = fact * i;

            i++;



        }
        return fact;
    }
}
