import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd or even Calculator using Bitwise Operator");
        System.out.print("Please Enter your Number: ");
         int number = input.nextInt();

         if ((number & 1) == 1) {
             System.out.println("Your number is ood");
         } else {
             System.out.println("Your number is Even");
         }


    }
}
