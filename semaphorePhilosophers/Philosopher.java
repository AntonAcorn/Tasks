package semaphorePhilosophers;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private Semaphore sem;
    private String name;
    private boolean full = false;

    public Philosopher(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    public void run() {
        if (!full) {
            try {
                sem.acquire();
                System.out.println(name + " кушает");
                sleep(1000);
                full = true;

                System.out.println(name + " выходит из-за стола");
                sleep(1000);
                sem.release();
                sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
