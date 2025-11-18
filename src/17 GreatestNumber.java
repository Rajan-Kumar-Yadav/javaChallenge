import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest Number Calculation");
        System.out.print("Please Enter your First  Number: ");
        int firstNumber = input.nextInt();
        System.out.print("Please Enter your Second Number: ");
         int secondNumber = input.nextInt();
        System.out.print("Please Enter your Third Number: ");
          int thirdNumber = input.nextInt();


        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber+" firstNumber is Greater");
        } else if (secondNumber >=thirdNumber) {
            System.out.println(secondNumber+" Second Number is Greater");
        } else {
            System.out.println(thirdNumber+" ThirdNumber is Greater");
        }
    }
}
