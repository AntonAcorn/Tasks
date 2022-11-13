package tasksWithArrays.MaximumOfSumsOfElements;

import java.util.Random;

public class MaximumOfSumsOfElements2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);

        }
        int sum = 0;
        int max = 0;
        int countIndex = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            sum = sum + numbers[i] + numbers [i+1]+ numbers [i +2];
            countIndex = i;
        }
        if(sum>max){
            max = sum;

        }
        System.out.println(countIndex);
        System.out.println(max);
    }
}
