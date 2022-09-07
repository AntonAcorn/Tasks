package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectComparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Mike"));
        people.add(new Person(1, "Bob"));
        people.add(new Person(2, "Lera"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() < o2.getId()){
                    return 1;
                } else if (o1.getId() > o2.getId()) {
                    return -1;
                } else{
                    return 0;
                }

            }
        });
        System.out.println(people);
    }
}

class Person {
    int id;
    String name;

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

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
