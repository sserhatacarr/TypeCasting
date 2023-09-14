import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        double b;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a whole number : ");
        a = inp.nextInt();

        System.out.print("Enter a decimal number : ");
        b = inp.nextDouble();

        double myDouble = a;
        int myInt = (int) b;

        System.out.println("Type casting version of the entered integer : " + myDouble);
        System.out.println("Type converted version of the entered decimal number : " + myInt);
    }
}
