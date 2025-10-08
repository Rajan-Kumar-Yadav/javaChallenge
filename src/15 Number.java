import java.util.Scanner;

class Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Number is Positive Negative OR Zero");
        System.out.print("Please Enter Your Number: ");
         double number = input.nextDouble();

         if (number < 0) {
             System.out.println(" Your Number  is Negative");
         } else if (number > 0) {
             System.out.println("Number is Positive ");
         } else {
             System.out.println("Your number is Zero");
         }

    }
}
