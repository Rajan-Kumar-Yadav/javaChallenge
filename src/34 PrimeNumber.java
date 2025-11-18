import java.util.Scanner;

 class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Welcome to Check Number is Prime or Not");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Number: ");
        int number = input.nextInt();
            boolean isPrime = primeNumber(number);
            if (isPrime ){
                System.out.println("your number is   Prime");
            } else {
                System.out.println("your number Not prime");
            }


    }
    public static boolean primeNumber(int number){
       int i = 2;
       while (i <number){
           if (number % i ==0){
             return false;
           }
           i++;
       }
       return true;
    }
}
