import java.util.Scanner;

class LeftSiftOperator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise Left shift Operator");
        System.out.print("Please Enter your first number: ");
        int firstNum = input.nextInt();
        System.out.print("Please Enter number of the times yor want to left shift: ");

        int  leftShiftTimes = input.nextInt();

        int BitwiseLeftShift = firstNum << leftShiftTimes;
        System.out.println("Left Shift of the Number is: " + BitwiseLeftShift);
    }
}
