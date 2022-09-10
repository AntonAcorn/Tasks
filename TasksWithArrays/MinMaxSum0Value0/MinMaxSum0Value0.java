package TasksWithArrays.MinMaxSum0Value0;

import java.util.Arrays;
import java.util.Random;

/*
Create a new array of size 100 and fill it with random numbers from 0 to 10000.
Then, using the for each loop, print to the console:
largest array element
smallest array element
number of array elements ending in 0
sum of array elements ending in 0
 */
public class MinMaxSum0Value0 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max value: " + max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min value: " + min);

        int count0 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0) {
                count0++;
            }
        }
        System.out.println("Number of array elements ending in 0 " + count0);


        int sum = 0;
        int sumCounter = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (sum % 10 == 0){
                sumCounter++;
            }
        }
        System.out.println("sum of array elements ending in 0 " + sumCounter);
    }
}
