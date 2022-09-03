package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; //В разных операционыых системах сепаратор разный
                                            //In different operating systems, the separator is different
        String path = separator + "Users" + separator + "acorn"+ separator +"Desktop"+ separator +"Temp.txt";
        File file = new File(path);                         //Абстракция файла
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
