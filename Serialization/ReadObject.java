package Serialization;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


            Person person1 = (Person) objectInputStream.readObject(); //Возвращается Object, поэтому нужен даункастинг
            Person person2 = (Person) objectInputStream.readObject();

            System.out.println(person1);
            System.out.println(person2);

            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
