import java.util.Scanner;

class GradesMarks {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        System.out.println("Welcome To grades Calculator");
        System.out.print("Please Enter your marks Percentage: ");
        double marks = input.nextDouble();

        if (marks > 90) {
            System.out.println("Your Grade is A");
        } else if (marks > 75) {
            System.out.println("Your Grade is B");
        } else if (marks > 60) {
            System.out.println("Your Grade is C");
        } else if (marks >30) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("Your Grade is F");
        }

    }
}
