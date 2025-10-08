import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest Number Calculation");
        System.out.print("Please Enter your First  Number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Please Enter your Second Number: ");
        double secondNumber = input.nextDouble();
        System.out.print("Please Enter your Third Number: ");
        double thirdNumber = input.nextDouble();


        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("firstNumber is Greater");
        } else if (secondNumber >thirdNumber && secondNumber > firstNumber) {
            System.out.println("Second Number is Greater");
        } else {
            System.out.println("ThirdNumber is Greater");
        }
    }
}
