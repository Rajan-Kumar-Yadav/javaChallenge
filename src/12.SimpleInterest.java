import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculation");
        System.out.print("Please Enter your Principal: ");
        float principal = input.nextFloat();
        System.out.print("Please Enter your Rate: ");
        float Rate = input.nextFloat();
        System.out.print("Please Enter your Time: ");
        int time = input.nextInt();

        float si = (principal * Rate * time) / 100;
        System.out.println("Simple Interest is: "+ si);
    }
}
