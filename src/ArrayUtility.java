import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter number of Element: ");
        int  size = input.nextInt();
        int[] array = new int[size];

        int i = 0;
        while (i < size) {
            System.out.println("Please enter element  number"+ (i+1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        return array;
    }
}
