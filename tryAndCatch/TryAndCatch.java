package tryAndCatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args){
        try{readFile();
        }catch (Exception e){
            System.out.println("File is not found");
        }



    }
    public static void readFile() throws IOException {
        File file = new File("sdfsdf");
        Scanner scanner = new Scanner(file);
        String lines = scanner.nextLine();
    }
}
