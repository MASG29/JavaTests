package Threading.FoodMaker;

public class Oven {
    private boolean isOn = false;

    public synchronized void preheatOven() {
        try {
            while (isOn) {
                printTask("Waiting for the oven to be clear");
                wait();
            }
            printTask("Oven pre-heating...");
            isOn = true;
            Thread.sleep(10000);
            isOn = false;
            printTask("Releasing oven!");
            notifyAll();
            printTask("Done!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public synchronized void bakeCake() {
        try {
            synchronized (this) {
                while (isOn) {
                    printTask("Waiting for the oven  to be clear");
                    wait();
                }
                printTask("Baking cake...");
                isOn = true;
                Thread.sleep(10000);
                isOn = false;
                printTask("Releasing oven!");
                notifyAll();
            }
            printTask("Done!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    private void printTask(String task) {
        System.out.println(Thread.currentThread().getName() + " " + " - " + task);
    }
}
