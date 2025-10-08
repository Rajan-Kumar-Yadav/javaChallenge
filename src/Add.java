import java.util.Scanner;

public class Add {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Adding");
        System.out.print("Please Enter FirsNumber: ");
        int firstNumber = input.nextInt();
        System.out.print("Please Enter SecondNumber: ");
        int SecondNumber = input.nextInt();

         int sum = firstNumber + SecondNumber;
        System.out.println("Sum of the Number is: "+ sum);
    }
}
