package serialization;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("people.bin"))) {
            //Сокращенная запись

            /*FileInputStream fileInputStream = new FileInputStream("people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);*/


            Person person1 = (Person) objectInputStream.readObject(); //Возвращается Object, поэтому нужен даункастинг


            System.out.println(person1);


            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
