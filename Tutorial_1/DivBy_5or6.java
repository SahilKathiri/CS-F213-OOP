package Tutorial_1;

import java.util.Scanner;

/**
 * Java program that reads a number (user input) and check if its divisible by 5 & 6
 * All possible cases must be handled
 */

public class DivBy_5or6 {
    public static void Divisible(int n) {
        if (n % 5 == 0 || n % 6 == 0) {
            if (n % 5 == 0)
                System.out.println(n + " is divisible by 5");
            if (n % 6 == 0)
                System.out.println(n + " is divisible by 6");
        }
        else
            System.out.println(n + " is not divisible by 5 or 6");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        Divisible(num);
    }
}
