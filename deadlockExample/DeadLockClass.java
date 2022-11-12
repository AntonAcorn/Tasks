package deadlockExample;

public class DeadLockClass {
    public static void main(String[] args) {
        final Integer r1 = 5;
        final Integer r2 = 10;

        DeadLockThread deadLockThreadR1R2 = new DeadLockThread(r1, r2);
        DeadLockThread deadLockThreadR2R1 = new DeadLockThread(r2, r1);

        new Thread(deadLockThreadR1R2).start();
        new Thread(deadLockThreadR2R1).start();

    }
}
