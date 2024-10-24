// Define a class that implements the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from MyRunnable! Count: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable(); // Instantiate an object of MyRunnable

        // Call the run method directly without creating a new thread
        myRunnable.run();

        // Main thread continues executing after the run method completes
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Main thread! Count: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

