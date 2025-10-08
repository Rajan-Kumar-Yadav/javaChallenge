import java.util.Scanner;
 class Product {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Product of the Two Number");
        System.out.print("Please Enter First NUmber: ");
        float firsNumber = input.nextFloat();
        System.out.print("Please Enter Second Number: ");
        float secondNumber = input.nextFloat();

        float product = firsNumber * secondNumber;
        System.out.println("Product of the Two Number is: "+ product);
    }
}
