package HashCodeAndEquals;

import java.util.*;

public class HashCodeAndEquals {
    public static void main(String[] args) {


    Map<Person, String> map = new HashMap<>();
    Set<Person> set = new HashSet<>();

        //Integer сравнивается с помощью контракта hashcode.equal, а не как примитивы
        //Integers are compared using the hashcode.equal contract, not like primitives
        /*Как работает equals (контракт hashcode, equals). Сначала проверяется хэшкод,
        если он не одинаковый, то доп проверка
        1. Сначала вызывается метод hashcode(). Если хэши разные, то объекты точно разные
        2. Если одинаковые:  объекты одинаковые или случилась коллизия
        3. Если и кэши одинаковые, то вызывается equals (он медленный)

        HashMap представляет из себя массив linkedlist'ов
        */




        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        map.put(person1, "123");
        map.put(person2, "123");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
}

class Person{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    private int id;
     private String name;

     public Person (int id, String name){
         this.id = id;
         this.name = name;
     }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}