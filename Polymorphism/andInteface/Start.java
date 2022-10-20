package Polymorphism.andInteface;

import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Swim human = new Human("Lesha", 25);
        Swim duck = new Duck("Donald");
        Swim submarine = new Submarine(100, 12);

        List<Swim> swimList = Arrays.asList(human, duck, submarine);
        for (Swim swim: swimList
             ) {
            swim.swim();
        }

            
        }



}
