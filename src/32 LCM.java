import java.util.Scanner;
 class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator");
        System.out.println("Please enter your First number: ");
         int firstNum = input.nextInt();
        System.out.println("Please enter your Second number: ");
        int secondNum = input.nextInt();
        int lcm = Lcm(firstNum,secondNum);
        System.out.println(lcm);



    }

    public static int Lcm(int firstNum, int secondNum) {

        int i = 1;
        while (i <= secondNum){
            int factor = firstNum * i;
            if (factor % secondNum == 0){
                return factor;
            }
            i++;
        }
     return 0;
    }
}
