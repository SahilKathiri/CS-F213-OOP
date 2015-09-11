package Tutorial_1;

import java.util.Scanner;

/**
 * Java program to compute f(x) to m terms.
 *
 *      f(x) = (1/x^1) + (1/x^3) + (1/x^5) + ...
 *
 * Both x and m are read from user input.
 */
public class Function {
    public static double f(double x, int m) {
        double result = 0;

        for (int i = 0, j = 1; i < m; i++, j +=2) {
            result += 1/Math.pow(x,j);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = inp.nextDouble();
        System.out.println();
        System.out.print("Enter m: ");
        int m = inp.nextInt();

        System.out.println("f(" + x + ") to " + m + " terms is: \n" + f(x,m));
    }
}
