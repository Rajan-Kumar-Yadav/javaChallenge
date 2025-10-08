import java.util.Scanner;

class Fahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome  to convert Fahrenheit to Celsius");
        System.out.print("Please Enter your Fahrenheit: ");
        double  fahrenheit = input.nextDouble();

        double Celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Fahrenheit to Celsius: " +Celsius + "C");

    }
}
