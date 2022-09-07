package Comparable;

import java.util.*;
import java.lang.Comparable;

public class Comparablee {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();
        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }
    private static void addElements(Collection collection){
        collection.add(new Person(3, "Bob"));
        collection.add(new Person(4, "Mike"));
        collection.add(new Person(1, "Kika"));
        collection.add(new Person(2, "George"));
    }
}

class Person implements Comparable<Person> {
    private int id;

    public String getName() {
        return name;
    }

    private String name;

    public int getId() {
        return id;
    }

    public Person(int id, String name) {
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


    @Override
    public int compareTo(Person o) {
        //назначаем то, как будет сортироваться объект в данном случае по длинне имени, можно по id
        //we assign how the object will be sorted in this case by the length of the name, you can sort by id
        if(this.name.length() > o.getName().length()){
            return 1;
        }else if (this.name.length() < o.getName().length()){
            return -1;
        }else {
            return 0;
        }
    }
}
