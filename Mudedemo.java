import java.util.Scanner;

class Myex extends Exception {
    String Strerror;

    public Myex(String s) {
        Strerror = s;
    }

    public void disp() {
        System.out.println("error:" + Strerror);
    }
}

class Mudedemo {
    public static void main(String args[]) {
        int a, b, c;
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            a = s.nextInt();
            b = s.nextInt();

            if (b == 0) {
                throw new Myex("Denominator is zero");
            }

            c = a / b;
            System.out.println("c = " + c);
        } catch (Myex m) {
            m.disp();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}
