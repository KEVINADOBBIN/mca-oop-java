// Thread 1: Prints "Good Morning" every 1 second
class Thread1 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("GOOD MORNING");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e);
        }
    }
}

// Thread 2: Prints "Hello" every 2 seconds
class Thread2 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e);
        }
    }
}

// Thread 3: Prints "Welcome" every 3 seconds
class Thread3 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e);
        }
    }
}

// Main class
public class TripleThread {
    public static void main(String[] args) {
        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        Thread t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}
