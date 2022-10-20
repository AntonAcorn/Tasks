package SemaphorePhilosophers;

import java.util.concurrent.Semaphore;
//Представь, что у нас есть 5 философов, которым нужно пообедать.
//При этом у нас есть один стол, и одновременно находиться за ним могут не более двух человек.
//
//Наша задача — накормить всех философов. Никто из них не должен остаться голодным,
// и при этом они не должны «заблокировать»
// друг друга при попытке сесть за стол (мы должны избежать deadlock).
public class Main  {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        Philosopher p1 = new Philosopher(sem, "1");
        Philosopher p2 = new Philosopher(sem, "2");
        Philosopher p3 = new Philosopher(sem, "3");
        Philosopher p4 = new Philosopher(sem, "4");
        Philosopher p5 = new Philosopher(sem, "5");
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

    }
}
