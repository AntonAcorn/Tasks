package digitize;

import java.util.Arrays;

//Convert number to reversed array of digits
public class Digitize {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
        System.out.println(Arrays.toString(digitize2(35231)));
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
    public static int[] digitize2(long n){
        String [] nums = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int [] result = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }
}