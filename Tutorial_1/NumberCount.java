package Tutorial_1;


/**
 * Java program to read a list of integers from command line
 * and print the number of positive, negative numbers and zeroes in the list.
 */

public class NumberCount {
    public static void count_nos(int[] list) {
        int pos = 0,
            neg = 0,
            zeros = 0;

        for (int i : list) {
            if (i < 0)
                neg++;
            else if (i > 0)
                pos++;
            else
                zeros++;
        }

        System.out.println("Positive numbers: " + pos + "\n" +
                            "Negative numbers: " + neg + "\n" +
                            "Zeroes: " + zeros);
    }

    public static void main(String[] args) {
        int[] list = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            list[i] = Integer.parseInt(args[i]);
        }

        count_nos(list);
    }
}
