import java.util.Scanner;

 class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculation of the Perimeter: ");
        System.out.print("Please Enter length of the in cm rectangle:");
        float length = input.nextFloat();
        System.out.print("Please Enter breath of the in cm rectangle: ");
        float breath = input.nextFloat();

        float PerimeterOfRectangle  = 2 *(length + breath);
        System.out.println("Perimeter of the Rectangle is: "+PerimeterOfRectangle + "cm");
    }
}
