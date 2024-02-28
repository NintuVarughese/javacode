import java.io.*;

class CThread implements Runnable {
    int n;

    public CThread(int a) {
        n = a;
    }

    public void run() {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println("\t=" + i);
        }
    }
}

public class MThread1 {
    public static void main(String args[]) {
        CThread t1, t2;
        Thread p, q;

        t1 = new CThread(100);
        t2 = new CThread(150);

        p = new Thread(t1);
        q = new Thread(t2);

        System.out.println("b4 thread");
        p.start();
        System.out.println("btw thread");
        q.start();
        System.out.println("after thread");
    }
}
