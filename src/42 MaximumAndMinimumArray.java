import java.util.Scanner;

 class MaximumAndMinimumArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Maximum and Minimum Array \n");
        System.out.print("please enter number of the element: ");
         int  size = input.nextInt();
         int[]  array = new int[size];

         int i = 0;
         while (i < array.length) {
             System.out.print("Please enter element no"+(i + 1) + " : ");
             array[i] = input.nextInt();
             i++;
         }
        int maxVale = maxElement(array);
         int minVale = minElement(array);
        System.out.println("Maximum Element is: "+ maxVale);
        System.out.println("Minimum Element is: "+minVale);
    }
    public static int maxElement(int[] array) {

        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        int i = 1;
        while (i < array.length){
            if (max < array[i]){
                max = array[i];
            }
            i++;
        }
        return max;
    }
    public static int minElement(int[] array){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length){
            if (min > array[i]){
                min = array[i];

            }
            i++;
        }
        return min;
    }
}
