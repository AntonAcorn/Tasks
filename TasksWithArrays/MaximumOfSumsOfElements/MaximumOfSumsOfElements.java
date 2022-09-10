package TasksWithArrays.MaximumOfSumsOfElements;

import java.util.Random;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите
значение суммы и индекс первого элемента тройки.


Create a new array of size 100 and fill it with random numbers from 0 to 10000.
Find the maximum among the sums of three neighboring elements. For the found triple with the maximum sum,
print the value of the sum and the index of the first element of the triple.
 */
public class MaximumOfSumsOfElements {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers [i] = random.nextInt(10000);
        }
        int max = 0;
        int countIndex = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i+3; j++){
                sum = sum + numbers[j];
            }
            if (sum > max){
                max = sum;
                countIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(countIndex);

    }
}
