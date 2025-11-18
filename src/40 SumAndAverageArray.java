import java.util.Scanner;

class SumAndAverageArray {
    public static void main(String[] args){
        System.out.println("Welcome to Sum and Average of An Array");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your size of element: ");
        int size = input.nextInt();
        int[]  array = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Please enter your element"+(i+1)+ " : ");
            array[i] = input.nextInt();
            i++;
        }

        int sumArray = sumOfArray(array);
        System.out.println("Sum of the array is: " + sumArray);
        double  averageArray = averageArray(array);
        System.out.println("Averager of the Array is: "+ averageArray);
    }
    public static int sumOfArray(int[] array){

        int sum = 0;
        int i = 0;
        while (i < array.length){

            sum = sum + array[i];
            i++;
        }
        return sum;
    }
    public  static double averageArray(int[] array) {

        int sumArray = sumOfArray(array);
        return (double) sumArray /array.length;

    }
}
