package File1toFile2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("File1toFile2/file1.txt");
        File file2 = new File("File1toFile2/file2.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);

        Random random = new Random();                   //put 1000 numbers from 0 to 100 to file 1
        for (int i = 0; i < 1000; i++) {
            pw1.println(random.nextInt(100));

        }
        pw1.close();

        Scanner scanner = new Scanner(file1);           //read file1
        double avg = 0;
        int counter = 0;
        int sum = 0;
        while (scanner.hasNext()) {                     //until there is something
            int result = Integer.parseInt(scanner.nextLine());//read line and parse to int
            sum = sum + result;                         //find sum
            counter++;
            if(counter == 20) {
                avg = sum / 20.0;
                pw2.println(avg);
                counter = 0;
                sum = 0;
            }

        }
        pw2.close();
        printResult(file2);

    }

    public static void printResult(File file) throws FileNotFoundException {
        try{Scanner scanner = new Scanner(file);
        double sum = 0;
        while (scanner.hasNext()){
            double result = Double.parseDouble(scanner.nextLine());
            sum = result + sum;
        }
        System.out.println((int)sum);}
        catch (FileNotFoundException e){

        }
    }
}
