package Tutorial_2;

import java.util.Arrays;

/**
 * Created by Sahil on 18-Sep-15 at 10:33 PM.
 * Project name is CS-F213-OOP
 */
public class ReverseTester {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[10];
        Reverser.reverse1(a, b);
        System.out.println(Arrays.toString(b));

        Reverser.reverse2(b);
        System.out.println(Arrays.toString(b));

        int[] c = Reverser.reverse3(b);
        System.out.println(Arrays.toString(c));
    }
}

class Reverser {
    public static void reverse1(int[] inpArr, int[] outArr) {
        for (int i = 0; i < inpArr.length; i++) {
            outArr[inpArr.length - i -1] = inpArr[i];
        }
    }
    public static void reverse2(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    public static int[] reverse3(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr.length - i -1] = arr[i];
        }
        return res;
    }
}
