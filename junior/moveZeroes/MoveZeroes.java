package junior.moveZeroes;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] A = {5, 6, 0, 4, 6, 0, 9, 0, 8};
        int position = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] != 0){
                swap(A, i, position);
                position++;
            }
        }
        System.out.println(Arrays.toString(A));

    }

    private static void swap(int[] a, int i, int n) {
        int temp = a[i];
        a[i] = a [n];
        a[n] = temp;
    }
}
