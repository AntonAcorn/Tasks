package WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("WriteToFile/WriteToFile");
        PrintWriter pw = new PrintWriter(file);                             //Пишет только текстовы значения.
        // Байты пишутся другим методом
        pw.println("I want to tell that I am writing from console");
        pw.close();
    }
}
