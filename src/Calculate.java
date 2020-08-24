import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        int one;
        int two;
        String coding="Coding is ";
        String fun="Fun!";
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number:");
        one = keybd.nextInt();
        System.out.println("Enter another number: ");
        two = keybd.nextInt();
        System.out.println("\n\n\nSum :" + (one+two));
        System.out.println("Product : " + (one*two));
        System.out.println("Square1 : " + (one*one));
        System.out.println("Square2  : " + (two*two));

        System.out.println(coding + fun);
    }
}
