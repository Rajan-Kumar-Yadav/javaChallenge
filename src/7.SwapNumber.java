import java.util.Scanner;

class SwapNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Swaping");
        System.out.print("Please Enter your Number A: ");
        int a = input.nextInt();
        System.out.print("Please Enter your Number B: ");
        int b = input.nextInt();
        int c = a;
           a = b;
           b = c;
        System.out.println("Your NUmber A: "+a);
        System.out.println("Your Number B: "+b);
    }
}
