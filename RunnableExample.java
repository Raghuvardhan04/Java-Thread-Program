// ================================================================
// Method 2: Creating Threads by IMPLEMENTING the Runnable interface
// ================================================================

class GoodMorningRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("GoodMorningRunnable interrupted");
                break;
            }
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // pause for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("HelloRunnable interrupted");
                break;
            }
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000); // pause for 3 seconds
            } catch (InterruptedException e) {
                System.out.println("WelcomeRunnable interrupted");
                break;
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Runnable r1 = new GoodMorningRunnable();
        Runnable r2 = new HelloRunnable();
        Runnable r3 = new WelcomeRunnable();

        // Wrap each Runnable in a Thread object
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        // Start all three threads - they now run concurrently
        t1.start();
        t2.start();
        t3.start();

        // Note: the threads loop forever (as required by the problem).
        // To stop the program manually, press Ctrl+C in the terminal.
    }
}
