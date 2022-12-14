package serialization;

import java.io.Serializable;

public class Person implements Serializable {           //Обязательно для записи нужно имплементить интерфейс
    private  int id;
    private int age;
    private transient String name; //Если мы не хотим записывать поле, то используем transient

   public Person (int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId (){
       return id;
    }

    public String getName(){
       return name;
    }

    public String toString(){
       return id + " : " + name;
    }

}
