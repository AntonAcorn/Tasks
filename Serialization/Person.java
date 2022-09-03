package Serialization;

import java.io.Serializable;

public class Person implements Serializable {           //Обязательно для записи нужно имплементить интерфейс
    private int id;
    private String name;

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
