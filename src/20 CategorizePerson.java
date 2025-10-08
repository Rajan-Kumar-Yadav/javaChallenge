import java.util.Scanner;

class CategorizePerson {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Checking Categorize of a Person");
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("Your are Child");
        } else if (age < 20) {
            System.out.println("your Teen ager");
        } else if (age < 60 ) {
            System.out.println("Your are adult");
        } else {
            System.out.println("Your are Senior ");
        }
    }
}
