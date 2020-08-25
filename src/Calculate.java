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
        System.out.println("\nSum : " + (one+two));
        System.out.println("Product : " + (one*two));
        System.out.println("Square1 : " + (one*one));
        System.out.println("Square2  : " + (two*two));

        System.out.println(coding + fun);
    }
}
