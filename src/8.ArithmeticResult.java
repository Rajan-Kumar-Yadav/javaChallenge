import java.util.Scanner;

 class ArithmeticResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To arithmetic Operator Calculation");
        System.out.print("Please Enter your First Number: ");
        int  firstNumber = input.nextInt();
        System.out.print("Please Enter your Second Number: ");
          int secondNumber = input.nextInt();


         int sum = firstNumber + secondNumber;
          int subtraction = firstNumber - secondNumber;
         int  multiply = firstNumber * secondNumber;
          double   divided =  (double) firstNumber / secondNumber;
        int  modulus = firstNumber % secondNumber;


        System.out.println("Sum of the NUmber is: "+ sum);
        System.out.println("Difference of the NUmber is: "+ subtraction);
        System.out.println("Multiplication of the Number is: "+ multiply);
        System.out.println("Division of the Number is: "+ divided);
        System.out.println("modulus of the Number is: "+ modulus);


    }
}
