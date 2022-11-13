package serializationWritingArrayOfObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("people2.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            int personCount = objectInputStream.readInt(); // считываем число, т.е. длину массива
            Person [] people = new Person[personCount]; // создаем массив, в который положим наши объекты

            for (int i = 0; i < personCount ; i++) {                    //заполняем массив тем, что считываем из файла people.bin
                people[i ] = (Person) objectInputStream.readObject();
            }

            System.out.println(Arrays.toString(people));

            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
