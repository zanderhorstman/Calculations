import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        String coding="Coding is ";
        String fun="Fun!";
        Scanner keybd = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int one = keybd.nextInt();
        System.out.print("Enter another number: ");
        int two = keybd.nextInt();

        int sum = one + two;
        int product = one * two;
        int square1 = one * one;
        int square2 = two * two;

        System.out.println("\nSum : " + sum); //Adding
        System.out.println("Product : " + product); //Multiplying
        System.out.println("Square1 : " + square1); //Square of int var "one"
        System.out.println("Square2  : " + square2); //Square of int var "two"

        System.out.println(coding + fun);
    }
}
