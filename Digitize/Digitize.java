package Digitize;

import java.util.Arrays;

//Convert number to reversed array of digits
public class Digitize {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
    }
    public static int[] digitize(long n) {
        String temp1 = n + "";
        char[] array = temp1.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = (char) temp;
        }
        int [] result = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            result[i] = (array[i]) - '0';

        }
        return result;
    }
}