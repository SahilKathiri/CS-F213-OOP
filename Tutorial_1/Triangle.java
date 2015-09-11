package Tutorial_1;

import java.util.Scanner;

/**
 * Java program that reads the 3 edges of a triangle and determines of it is a valid triangle.
 * If it is, it classifies them as equilateral, isosceles or scalene
 */

public class Triangle {
    public static boolean isTriangle(int a, int b, int c) {
        return (a + b <= c) || (b + c <= a) || (c + a <= b);
    }

    public static void triangle_type(int a, int b, int c) {
        if (isTriangle(a, b, c)) {
            if (a == b && b == c)
                System.out.println("It is an Equilateral triangle");
            else if (a == b || b == c)
                System.out.println("It is an Isosceles triangle");
            else
                System.out.println("It is a Scalene triangle");
        }
        else
            System.out.println("The given edges do not form a triangle");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt(),
            b = inp.nextInt(),
            c = inp.nextInt();

        triangle_type(a, b, c);
    }
}
