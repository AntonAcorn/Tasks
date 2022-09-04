package Serialization2;

import java.io.*;

public class WriteObject {
    public static void main(String [] args){

        Person [] people = new Person[]{new Person(1, "Bob"), new Person(2,"Mark"), new Person(3, "Cat")};



        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people3.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(people);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
