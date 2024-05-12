package functional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class MainClass{

    public static void main(String[] args) {
        // Testing functional interface
        MainClass mainClass = new MainClass();
    }

    /*public void run() {
        lock();
        show();
    }

    public static synchronized void lock() {
        System.out.println(
                Thread.currentThread().getName());
        {
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName());
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName()
                            + " end");
        }
    }

    public void show() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("in show block " + Thread.currentThread().getName());
        System.out.println("in show block " + Thread.currentThread().getName() + " end");
    }

    public static void main(String[] args)
    {
        MainClass g1 = new MainClass();
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g1);
        MainClass g2 = new MainClass();
        Thread t3 = new Thread(g2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }*/
}
