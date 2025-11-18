import java.util.Scanner;

class BitwiseCompliment {
public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Bitwise Compliment  of Two Number");
    System.out.print("Please enter your firs Number: ");
      int  firstNum = input.nextInt();
        int bitwiseCompliment = ~firstNum;

    System.out.println("bitwise compliment"+bitwiseCompliment);

}
}
