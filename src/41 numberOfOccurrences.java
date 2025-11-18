import java.util.Scanner;

 class numberOfOccurrences {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurrences of the number in the Array");
        System.out.print("please enter number of the element: ");
        int size = input.nextInt();
        int[] array = new int[size];

        int i = 0;
        while (i < array.length){

            System.out.print("Please enter element no "+ (i +1)+": ");
             array[i] = input.nextInt();
            i++;

        }
        System.out.print("Now enter the number you want to find: ");
        int number = input.nextInt();


         int numberOfElement = occurrencesOfArray(array,number);
        System.out.println("Your element was found "+numberOfElement + " times in the array");
    }
    public static int occurrencesOfArray(int[] array ,int number){
        int numberElement = 0;
        int i = 0;

       while ( i < array.length) {
           if (array[i] == number ){
               numberElement++;
           }


           i++;
       }
       return numberElement;
    }
}
