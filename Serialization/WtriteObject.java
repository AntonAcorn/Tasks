package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WtriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2,"Mike");

        try {
            // Создали файл, в который мы будем записывать данные
            // тот класс предназанчен для записи последовательности  байтов. Т.е. неважно картинка это или звук
            // он максимально абстрактен
            FileOutputStream fileOutputStream = new FileOutputStream("people.bin");


            //ObjectOutputStream - более конкретный, именно для записи объектов
            //он берет именно наши объекты и превращает их в байты
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);

            fileOutputStream.close();           //Не забывать закрывать! Иначе не будет работать

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
