package Tutorial_3;

import java.util.ArrayList;

class Cell {
    private int row, col;
    private int val;

    public Cell(int row, int col, int val) {
        this.row = row;
        this.col = col;
        this.val = val;
    }

    public int getRow() {return row;}

    public int getCol() {return col;}

    public int getVal() {return val;}

    public Cell() {}
}

class SparseMatrix {
    ArrayList<Cell> matrix = new ArrayList<>();

    int rows, cols;
    public SparseMatrix(int[][] a) {
        rows = a.length;
        cols = a[1].length;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (a[i][j] != 0) {
                    Cell temp = new Cell(i, j, a[i][j]);
                }
    }

    public SparseMatrix() {}


    public SparseMatrix add(SparseMatrix bMatrix) {
        ArrayList<Cell> a = this.matrix;
        ArrayList<Cell> b = bMatrix.matrix;
        ArrayList<Cell> res = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getCol() == b.get(i).getCol() && a.get(i).getRow() == b.get(i).getRow()) {
                res.add(new Cell(a.get(i).getRow(), a.get(i).getRow(), a.get(i).getVal()));
            }
        }

        SparseMatrix c = new SparseMatrix();
        c.matrix = res;
        return c;
    }

    public void display() {
        ArrayList<Cell> a = this.matrix;

        for (int i = 0, irow = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(a.get(irow).getVal() != 0) {
                    System.out.println(String.format("%5d", a.get(irow).getVal()));
                    irow++;
                }
                else
                    System.out.println(String.format("%5d", 0));
            }
        }
    }
}


public class SparseMatrixTester {
    public static void main(String[] args) {

        int[][] a = {{1, 0, 0, 0}, {0, 2, 0, 0}, {0, 0, 3, 0}};
        int[][] b = {{0, 4, 0, 0}, {0, 5, 0, 0}, {0, 0, 0, 6}};

        SparseMatrix sm1 = new SparseMatrix(a);
//        SparseMatrix sm2 = new SparseMatrix(b);
//        SparseMatrix sm3 = sm1.add(sm2);
        sm1.display();
    }

}
