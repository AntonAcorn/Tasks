package myThreads;
import java.lang.Thread;

//3 ways of creating thread
public class MyThreads {
    public static void main (String [] args){
        MyThread myThread = new MyThread(); //#1 Создаем объект своего класса, то есть нить создается через класс
        myThread.start();                   //#1 Сreate an object of our class, that is, a thread is created through a class

        MyThread myThread2 = new MyThread();
        myThread2.start();

        Thread runnerThread = new Thread(new Runner());//#2 Создаем стандартный объект thread и в его параметры кладем новый объект
        runnerThread.start();                          //#2 Create a standard thread object and put a new object in its parameters

        Thread thread3 = new Thread(new Runnable() {    //Создаем thread через анонимный класс
            @Override                                   //Create a thread through an anonymous class
            public void run() {

            }
        });

    }
}

class MyThread extends Thread{          //#1 Create class that extends Thread
    @Override
    public void run() {
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(i);
        }
    }
}

class Runner implements Runnable{       //#2 create a class that implements the interface,
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from Runner thread " + i);
        }
    }
}
