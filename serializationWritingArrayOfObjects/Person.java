package serializationWritingArrayOfObjects;

import java.io.Serializable;

public class Person implements Serializable {       //НЕ ЗАБЫТЬ, ИНАЧЕ НЕ БУДЕТ РАБОТАТЬ
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}
