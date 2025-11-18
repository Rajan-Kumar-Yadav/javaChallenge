import java.util.Scanner;

 class GCD {
    public static void main(String[] args){
        System.out.println("Welcome to GCD calculation\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your first number: ");
        int firstNum = input.nextInt();
        System.out.print("Please enter your Second number: ");
        int secondNum = input.nextInt();
        int gcd = Gcd(firstNum,secondNum);
        System.out.println("your gcd "+gcd);

    }
    public static int Gcd(int num1 , int num2){
        int gcd = 1;
        int i = 2;
        int leastNum = leastNumber(num1,num2);
        while ( i <=leastNum ){
            if (num1 % i ==0 && num2 % i ==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int leastNumber(int num1, int num2){
        if (num1<num2){
            return num1;
        } else {
            return num2;
        }
    }
}
