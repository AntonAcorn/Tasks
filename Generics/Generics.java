package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1));
        animals.add(new Animal(2));
        animals.add(new Animal(3));

       List <Dog> dogs = new ArrayList<>();
       dogs.add(new Dog());
       dogs.add(new Dog());
       dogs.add(new Dog());

       /*  Object
           Animal
           Dog
           Мы можем сделать List<? extends Animal> list, тогда лист будет принимать Animal и его потомков
           Мы можем сделать List<? super Animal> list, тогда лист будет принимать все, что выше Animal, т.е. только object

           We can make a list<? extends Animal> list, the list will accept Animal and its children
           We can make a list<? super Animal> list, then the list will be everything above Animal, i.e. accept. object only

        */


        test(animals);
        test(dogs); // полиморфизм в данном случае не работает, в параметры метода нужно добавить в метод - ? WildCard
                    // polymorphism does not work in this case, in the method parameters you need to add to the method - ? wild card
                    // private static void test(List<? extends Animal> list)

    }
    //private static void test(List<Animal> list)
    private static void test(List<? extends Animal> list){
        for (Animal animal: list
             ) {
            System.out.println(animal);    //если не переопределить метод toString, то будет выводить хэщкод
                                            //if you do not override the toString method, it will display a hashcode
        }
    }
}
