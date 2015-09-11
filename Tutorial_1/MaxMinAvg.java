package Tutorial_1;

/**
 * Java program that reads numbers from command line
 * and displays the maximum, minimum and the average of the numbers
 */

public class MaxMinAvg {
    public static void max_min_avg(int[] list) {
        int max = list[0], min = list[0];
        double sum = 0;

        for (int num : list) {
            sum += num;
            if (num < min)
                min = num;
            else if (num > max)
                max = num;
        }

        System.out.println("Max: " + max + "\n" +
                            "Min: " + min + "\n" +
                            "Average: " + sum/list.length);
    }

    public static void main(String[] args) {
        int[] list = new int[args.length];

        for (int i = 0; i < args.length; i++) {    //Converts the string array into integer array
            list[i] = Integer.parseInt(args[i]);
        }

        max_min_avg(list);
    }
}
