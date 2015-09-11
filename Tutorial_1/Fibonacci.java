package Tutorial_1;

import java.util.Scanner;

/**
 * Java program that generates the first 'n' Fibonacci numbers,
 * where n is read as user input
 */
public class Fibonacci {
    public static int fib_rec(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return fib_rec(n - 1) + fib_rec(n - 2);
        }
    }

    public static void fib_iter(int n) {
        int prev1 = 0, prev2 = 1, savePrev1 = 1;
        for (int i = 0; i < n; i++) {
            prev1 = prev2;
            prev2 = savePrev1;
            savePrev1 = prev1 + prev2;
            System.out.print(prev1 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number upto which Fibonacci series to generate: ");
        int num = inp.nextInt();
        System.out.println("Fibonacci series upto " + num + " numbers: (iterative)");
        fib_iter(num);

        System.out.println();

        System.out.println("Fibonacci series upto " + num + " numbers: (recursive)");
        for (int i = 0; i < num; i++)
            System.out.print(fib_rec(i) + " ");

    }
}
