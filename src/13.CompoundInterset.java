import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to CompoundInterest Calculator");
        System.out.print("Please Enter Your Principal Amount RS: ");
        double  principal = input.nextDouble();
        System.out.print("Please Enter your Rate: ");
        float rate = input.nextFloat();
        System.out.print("Please Enter yor Years: ");
        float time = input.nextFloat();

        double compInterest = principal * Math.pow((1 + rate/100), time);

        System.out.println("Compound Interest Rs: "+ compInterest);
    }
}
