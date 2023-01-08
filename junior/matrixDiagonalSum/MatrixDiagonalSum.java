package junior.matrixDiagonalSum;

//Подсчитайте сумму всех элементов на основной диагонали и всех элементов на дополнительной диагонали,
// которые не являются частью основной диагонали.
//        {1, 2, 3},
//        {4, 5, 6},
//        {7, 8, 9}
public class MatrixDiagonalSum {
    public static int sum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum = sum + matrix[i][i];
            sum = sum + matrix[i][n - 1 - i];
        }
        if (n % 2 == 1){
            sum = sum - matrix[n/2][n/2];
        }
            return sum;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(sum(array));
    }
}
