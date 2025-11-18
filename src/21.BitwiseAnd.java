import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to bitwise And of Tow number");
        System.out.print("Please Enter your number first number: ");
            int firstNum = input.nextInt();
        System.out.print("Please Enter your number Second number:  ");
        int secondNum = input.nextInt();

        int bitwiseNum = firstNum & secondNum;

        System.out.println("bitwseNumber is: " + bitwiseNum);
    }
}
