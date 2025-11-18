import java.util.Scanner;

class RightShiftOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Right Shift Operator");
        System.out.print("Please Enter your  Number: ");
        int  number = input.nextInt();
        System.out.print("Please Enter your number of The Times you want ot divide by Two: ");
         int numberTimes = input.nextInt();

        double rightShiftOperator = number >> numberTimes;

        System.out.println("right shift of The Operator is: " + rightShiftOperator);
    }

}
