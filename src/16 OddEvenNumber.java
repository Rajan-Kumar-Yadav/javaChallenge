import java.util.Scanner;

class OddEvenNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Number is Odd or Even");
        System.out.print("Please Enter your Number: ");
         int number = input.nextInt();
         if (number % 2 == 1) {
             System.out.println("Your Number is Odd");
         } else {
             System.out.println("Your Number is Even");
         }
    }
}
