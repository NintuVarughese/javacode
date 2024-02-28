class CThread extends Thread {
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

public class MThread {
    public static void main(String args[]) {
        CThread t1, t2;
        t1 = new CThread(100);
        t2 = new CThread(150);
        System.out.println("b4 Thread");
        t1.start();
        System.out.println("btw thread");
        t2.start();
        System.out.println("after thread");
    }
}
