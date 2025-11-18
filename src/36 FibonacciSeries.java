import java.util.Scanner;

class FibonacciSeries {
    public static void  main(String[] args){
        System.out.println("Welcome to Fibonacci series");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number up to which fibonacci series print: ");
        int number = input.nextInt();
        fibonacciSeries(number);

    }
    public static void fibonacciSeries(int number){
        if (number < 0) return;
        System.out.print("0 ");
        if (number == 0) return;
        System.out.print("1 ");
        int firstNum = 0 , secondNum = 1;

        while (firstNum + secondNum < number){
            int third = firstNum + secondNum;
            System.out.print(third + " ");
            firstNum = secondNum;
            secondNum = third;
        }
    }
}
