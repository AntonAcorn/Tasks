package junior.matrixDiagonalSum;

import java.util.Arrays;

//Подсчитайте сумму всех элементов на основной диагонали и всех элементов на дополнительной диагонали,
// которые не являются частью основной диагонали.
//        {1, 2, 3},
//        {4, 5, 6},
//        {7, 8, 9}
public class MatrixDiagonalSum {

    public static void main(String[] args) {


    }

    public static int countDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            sum += matrix[i][i];
            if (j != i) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
