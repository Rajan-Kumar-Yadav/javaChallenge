import java.util.Scanner;

 class Multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication of Table\n");
        System.out.print("Please Enter your Number: ");
        int number = input.nextInt();
        printTable(number);
    }
    public static void printTable(int num){
        int i = 1;
        while (i <=10){
            System.out.println(num + " X " + i +  " = "+ num*i);
            i++;
        }
    }





}
