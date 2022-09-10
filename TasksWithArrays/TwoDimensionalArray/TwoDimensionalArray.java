package TasksWithArrays.TwoDimensionalArray;
/*Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько,
вывести индекс последней из них.

/*Fill a two-dimensional array (matrix) with random numbers from 0 to 50.
Set the matrix size to m=12, n=8 (m - row dimension, n - column dimension).
Print the index of the line in the console, the sum of the numbers in which is maximum.
If there are several such lines,print the index of the last one.
 */

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println(sum);
            if (sum >= maxSum) {        // >=x - Если таких строк несколько, вывести индекс последней из них.
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println();
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}
