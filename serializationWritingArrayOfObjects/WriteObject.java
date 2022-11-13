package serializationWritingArrayOfObjects;

import java.io.*;

public class WriteObject {
    public static void main(String [] args){
        Person [] people = {new Person(1, "Bob"), new Person(2, "mark"), new Person(3,"Cat")};


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people2.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeInt(people.length);     //Указываем длинну массива через writeInt
            for(Person person: people){
                objectOutputStream.writeObject(person);
            }

            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
