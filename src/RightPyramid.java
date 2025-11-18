import java.util.Scanner;

public class RightPyramid {
    public static void main(String[] args){
        System.out.println("Welcome to Right Half Pyramid");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your row Number: ");
        int row = input.nextInt();

       rightHalfPyramid(row);
           reverseRightHalfPyramid(row);
           leftHalfPyramid(row);
    }
    public static void rightHalfPyramid(int num){
        System.out.println("Welcome to Right Half Pyramid");
       int row = 0;

       while (row < num) {
           System.out.print("*");
           int col = 0;
           while (col < row) {
               System.out.print(" *");
               col++;
           }
           System.out.println();
           row++;
       }

    }
    public static void reverseRightHalfPyramid(int num){
        System.out.println("Welcome Reverse Right half pyramid");
          int  row = num;
          while (row > 0){
              int i =0;
              while (i < row){
                  System.out.print("* ");
                  i++;
              }
              System.out.println();
              row--;
          }
    }
    public static void leftHalfPyramid(int num){

        System.out.println("Here is your left Half Pyramid");
        int row = num;
        while (row > 0){
            int j = 0;
            while (j < row){
                System.out.print("  ");
                j++;
            }

            int i =0;
            while (i <= (num-row)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;

        }
    }
}
