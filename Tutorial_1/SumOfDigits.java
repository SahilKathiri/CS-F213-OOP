package Tutorial_1;

import java.util.Scanner;

/**
 * Java program that reads an integer from the user and computes the sum of its digits
 * and prints the sum
 */
public class SumOfDigits {
    public static void sum_of(char[] num) {
        int sum = 0;
        for (char n : num) {
            int number = Integer.parseInt("" + n);
            sum += number;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        char[] num = inp.next().toCharArray();
        System.out.print("The sum of digits of its digits is :");
        sum_of(num);

    }
}
