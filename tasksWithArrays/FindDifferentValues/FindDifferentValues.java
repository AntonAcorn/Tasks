package tasksWithArrays.FindDifferentValues;

import java.util.Random;
import java.util.Scanner;

/*1. С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно).
Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
*/
/*1. The number n is entered from the keyboard - the size of the array.
You must create an array of the specified size and fill it with random numbers from 0 to 10 (inclusive).
Using the for each loop, print the contents of the array to the console, and also print information about:
a) The length of the array
b) Number of numbers greater than 8
c) The number of numbers equal to 1
d) The number of even numbers
e) The number of odd numbers
f) The sum of all elements of the array
*/
public class FindDifferentValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        int counter8 = 0;
        int counter1 = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        int sum = 0;
        for (int number : numbers
        ) {
            System.out.println(number);
            if (number > 8) {
                counter8++;
            } else if (number == 1) {
                counter1++;
            } else if (number % 2 == 0) {
                evenNumber++;
            } else if (number % 2 != 0) {
                oddNumber++;
            }
            sum += number;

        }
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + counter8);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}