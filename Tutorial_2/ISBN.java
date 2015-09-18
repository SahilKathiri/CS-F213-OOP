package Tutorial_2;

import java.util.Arrays;
import java.util.Scanner;

public class ISBN {
    static Scanner inp = new Scanner(System.in);

    public static String validate(int[] isbn) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (10 - i)*isbn[i];
        }

        String check = Integer.toString((11 - sum%11) % 11);
        if ("10".equals(check))
            check = "X";

        return check;
    }

    public static void main(String[] args) {
        System.out.print("Enter a book's ISBN number: ");
        int[] isbn = new int[9];
        String code = inp.next();

        for (int i = 0; i < code.length(); i++) {
            isbn[i] = Integer.parseInt("" + code.charAt(i));
        }

        System.out.println("The corrected ISBN number is: " +
                Arrays.toString(isbn).replaceAll("[\\[\\],]", "").replaceAll(" ","") +
                ISBN.validate(isbn));
    }
}
