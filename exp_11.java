
class Printer {
    synchronized void printDocument(String name) {
        System.out.println(name + " is printing...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " printing completed.");
    }
}

class UserThread extends Thread {
    Printer printer;

    UserThread(Printer printer, String name) {
        super(name);
        this.printer = printer;
    }

    public void run() {
        System.out.println(getName() + " started.");
        printer.printDocument(getName());
        System.out.println(getName() + " terminated.");
    }
}

public class exp_11 {
    public static void main(String[] args)
            throws InterruptedException {
        Printer printer = new Printer();

        UserThread t1 = new UserThread(printer, "Thread-1");
        UserThread t2 = new UserThread(printer, "Thread-2");

        System.out.println("Initial state: " + t1.getState());

        t1.start();
        t2.start();

        Thread.sleep(100);
        System.out.println("Current state: " + t1.getState());

        t1.join();
        t2.join();

        System.out.println("Final state: " + t1.getState());
        System.out.println(
            "Synchronization prevents concurrent access to the printer."
        );
    }
}
