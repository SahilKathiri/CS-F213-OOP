package Tutorial_2;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    int[][] mat;
    int[] sumOfRows, sumOfColumns;
    int allSum;

    static Scanner inp = new Scanner(System.in);

    public Matrix(int n, int m) {
        mat = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                mat[i][j] = inp.nextInt();
    }

    public void rowSum() {
        sumOfRows = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sumOfRows[i] += mat[i][j];
            }
        }
    }

    public void colSum() {
        sumOfColumns = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sumOfColumns[i] += mat[j][i];
            }
        }
    }

    public void sum() {
        for (int[] row : mat) {
            for (int elem : row) {
                allSum += elem;
            }
        }
    }


    public static void main(String[] args) {

        System.out.print("Enter the rows and columns respectively: ");
        int r = inp.nextInt();
        int c = inp.nextInt();

        Matrix m = new Matrix(r, c);
        m.colSum();
        m.rowSum();
        m.sum();

        m.display();
    }

    private void display() {
        for (int[] row : mat) {
            for (int elem : row) {
                System.out.print(elem + "   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Row sum: " + Arrays.toString(sumOfRows));
        System.out.println("Column sum: " + Arrays.toString(sumOfColumns));
        System.out.println("Sum of all elements: " + allSum);
    }
}
