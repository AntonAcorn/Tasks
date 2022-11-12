package deadlockExample;

public class DeadLockThread implements Runnable {
    private final Integer r1;
    private final Integer r2;

    public DeadLockThread(Integer r1, Integer r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void run() {
        synchronized (r1) {
            System.out.println(Thread.currentThread().getName() + " захватил ресурс: " + r1);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (r2){
                System.out.println(Thread.currentThread().getName() + " захватил ресурс: " + r2);
            }
        }
    }
}
