package exceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main (String [] args) throws ScannerException{
        Scanner scanner = new Scanner(System.in);

        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if (number != 0){
                throw new ScannerException("User entered something except 0");
            }
        }
    }
}
