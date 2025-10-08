import java.util.Scanner;

 class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome ot calculation of the Area of the Triangle");
        System.out.print("Please Enter The base of the triangle: ");
        float base = input.nextFloat();
        System.out.print("Please Enter the height of the Triangle: ");
        float  height = input.nextFloat();

        float AreaOfTriangle = ((float) 1 / 2)* base * height;
        System.out.println("Area of The Triangle: " + AreaOfTriangle + "cm");
    }
}