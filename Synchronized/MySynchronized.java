package Synchronized;

public class MySynchronized {
    private  int counter;
    public static void main(String [] args) throws InterruptedException {
            MySynchronized mySynchronized = new MySynchronized();
            mySynchronized.doWork();
    }
    public synchronized void increment(){   //synchronized обеспечивает то, что в метод заходит только один поток
                                            //Используется только с методом
                                            //synchronized ensures that only one thread enters the method
                                            //Used only with method
                                            //without it, a race condition and the result is incorrect

            counter++;
    }

    public void doWork() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 20000; i++)
                    increment();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 20000; i++ )
                    increment();
            }
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(counter);
    }
}
