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
        System.out.println("\nSum : " + (one+two)); //Adding
        System.out.println("Product : " + (one*two)); //Multiplying
        System.out.println("Square1 : " + (one*one)); //Square of int var "one"
        System.out.println("Square2  : " + (two*two)); //Square of int var "two"

        System.out.println(coding + fun);
    }
}
