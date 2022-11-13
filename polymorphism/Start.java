package polymorphism;

import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
            Dancer breakDancer = new BreakDancer("Sasha", 20);
            Dancer classicDancer = new ClassicDancer("Artem", 35);
            Dancer ticTonikDancer = new TicTonikDancer("Kolya", 13);

            List<Dancer> dancerList = Arrays.asList(breakDancer, classicDancer, ticTonikDancer);

        for (Dancer dancers: dancerList
             ) {
            dancers.dance();
        }

    }
}
