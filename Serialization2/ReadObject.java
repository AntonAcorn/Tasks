package Serialization2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main (String[] args){

        try {
            FileInputStream fileInputStream = new FileInputStream("people3.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person [] people = (Person []) objectInputStream.readObject();

            System.out.println(Arrays.toString(people));



        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
