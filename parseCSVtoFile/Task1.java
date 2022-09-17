package parseCSVtoFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        parseCsvToFile();


    }
    public static void parseCsvToFile(){
        //        while (scanner.hasNext()) {
//            String[] lines = scanner.nextLine().split(";");
//            if (Integer.parseInt(lines[2]) == 0) {
//                printWriter.println(lines[0] + ", " + lines[1] + ", " + lines[2]);
//            }
//        }
//        scanner.close();
//        printWriter.close();

        try{
            File file1 = new File("parseCSVtoFile/shoes.csv");
            Scanner scanner = new Scanner(file1);

            File fileOut = new File("parseCSVtoFile/missing_shoes.txt");

            PrintWriter printWriter = new PrintWriter(fileOut);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String [] lines = line.split(";");
                int size = Integer.parseInt(lines [2]);
                if (lines.length != 3){
                    throw new IndexOutOfBoundsException();
                }
                if(size == 0){
                    printWriter.println(lines[0] + ", " + lines[1] + ", " + lines[2]);
                }
            }
            scanner.close();
            printWriter.close();}
        catch (FileNotFoundException e){
            System.out.println("");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Некорректный файл");
        }
    }
}
