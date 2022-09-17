package parseFileToStringList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("parseFileToStringList/people.txt");
        System.out.println(parseFileToStringList(file));
    }
    public static List<String> parseFileToStringList (File file) {
        List<String> list = null;
        try {
            Scanner scanner = new Scanner(file);
            list = new ArrayList<>();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String [] person = line.split(" ");
                int x = Integer.parseInt(person[1]);
                if (x < 0){
                    throw new IllegalArgumentException();
                }
                list.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return list;
    }
}
