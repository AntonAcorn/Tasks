package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue2 {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);
        /*
        Add() - offer()
        remove() - poll()
        element() - peek()
        Первая колонка выбрасывает исключения, второая возвращает специальное значение
        The first column throws exceptions, the second returns special value
        */
        Queue <Person> people = new ArrayBlockingQueue<>(3); // ArrayBlockingQueue отличается там, что мы задаем ее размер
        /*people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);*/

        //3 -> 2 -> 4 -> 1

        /*System.out.println(people.remove());
        System.out.println(people.peek());    //показывает элемент в очереди и оставляет его там
        System.out.println(people);*/

        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));

    }
}

class Person{
    int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
