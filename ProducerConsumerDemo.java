class PC {
    int[] Q = new int[1000];
    static int i = 1;
    int cnt = 0, front = 0, rear = 0;

    // Produce method
    synchronized void produce() {
        try {
            while (cnt == 5) {  // Buffer full
                wait();
            }

            Q[rear] = i;
            System.out.println("Produced: " + i);
            i++;
            rear++;
            cnt++;
            notify();  // Notify consumer
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Consume method
    synchronized void consume() {
        try {
            while (cnt == 0) {  // Buffer empty
                wait();
            }

            int val = Q[front];
            System.out.println("Consumed: " + val);
            front++;
            cnt--;
            notify();  // Notify producer
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Producer thread
class ThreadP extends Thread {
    PC p1;

    ThreadP(PC p1) {
        this.p1 = p1;
    }

    public void run() {
        while (true) {
            p1.produce();
        }
    }
}

// Consumer thread
class ThreadC extends Thread {
    PC p1;

    ThreadC(PC p1) {
        this.p1 = p1;
    }

    public void run() {
        while (true) {
            p1.consume();
        }
    }
}

// Main class
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        PC p = new PC();
        ThreadP producer = new ThreadP(p);
        ThreadC consumer = new ThreadC(p);

        producer.start();
        consumer.start();
    }
}
