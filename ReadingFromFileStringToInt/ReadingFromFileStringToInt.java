package ReadingFromFileStringToInt;

import java.io.File;
import java.io.IOException;
import java.util.*;

//Считаем текст из файла в массив, преобразовав String в int
//Read text from file to array by converting String to int
public class ReadingFromFileStringToInt {
    public static void main  (String [] args) throws IOException {
        File file = new File("ReadingFromFileStringToInt/ReadingFromFileStringToIntText"); //Абстракция файла
        Scanner scanner = new Scanner(file); //Создали сканнер, в который положили файл
        String text = scanner.nextLine(); //Считаывем сканнером из файла
        String [] stringArray = text.split(" ");//Создаем массив и возвращаем в него массив строк без пробела
        int [] numbersArray = new int[stringArray.length];//Создаем массив чисел длинной массива строк
        int counter = 0; //Создали счетчик индексов

        for (String lines: stringArray){
            numbersArray [counter++] = Integer.parseInt(lines);  //Вызываем статический метод Integer.parseInt для преобразования каждой строки в int
        }
        System.out.println(Arrays.toString(numbersArray));

        /* File abstraction
        Created a scanner into which we put the file
        Read by scanner from file
        Create an array and return an array of strings to it without a space
        Create an array of numbers with a long array of strings
        Created an index counter
        Call the static method Integer.parseInt to convert each string to an int*/







    }
}
