import java.util.Scanner;

class BitwiseXor {
public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to BitwiseXOR  of Two Number");
    System.out.print("Please enter your firs Number: ");
      int  firstNum = input.nextInt();
    System.out.print("Please enter your Second Number: ");
       int secondNum = input.nextInt();

        int bitwiseOr = firstNum ^ secondNum;

    System.out.println("bitwiseXOr of the two Number is: " + bitwiseOr);

}
}
