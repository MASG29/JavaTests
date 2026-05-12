package Threading.FoodMaker;

public class MixingBowl {
    private boolean inUse = false;


    public synchronized void mixDryIngredients() {
        try {
            printTask("Mixing dry ingredients...");

                while (inUse) {
                    printTask("Waiting for the mixing bowl...");
                    wait();
                }

                printTask("Using mixing bowl!");
                inUse = true;
                Thread.sleep(200);

                printTask("Adding cake flour");
                Thread.sleep(200);

                printTask("Adding salt");
                Thread.sleep(200);

                printTask("Adding baking powder");
                Thread.sleep(200);

                printTask("Adding baking soda");
                Thread.sleep(200);

                printTask("Mixing...");
                Thread.sleep(200);

                // Refactor to synchronize access to mixingBowlInUse
                inUse = false;
                printTask("Releasing mixing bowl!");
                notifyAll();


            printTask("Done!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public synchronized void mixWetIngredients() {
        try {
            printTask("Mixing wet ingredients...");

            // Refactor to synchronize access to mixingBowlInUse

                while (inUse) {
                    printTask("Waiting for the mixing bowl...");
                    wait();
                }
                inUse = true;

                Thread.sleep(1000);
                printTask("Adding butter...");
                Thread.sleep(500);

                printTask("Adding eggs...");
                Thread.sleep(500);

                printTask("Adding vanilla extract...");
                Thread.sleep(500);

                printTask("Adding buttermilk...");
                Thread.sleep(500);

                printTask("Mixing...");
                Thread.sleep(1500);

                printTask("Releasing whisk!");
                notifyAll();

                // Refactor to synchronize access to mixingBowlInUse
                inUse = false;
                printTask("Releasing mixing bowl!");
                notifyAll();



            printTask("Done!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public synchronized void combineIngredients() {
        try {

                while (inUse) {
                    printTask("Waiting for the mixing bowl...");
                    wait();
                }
                printTask("Combining ingredients...");
                inUse = true;
                Thread.sleep(1000);

                printTask("Adding dry mix to wet mix...");
                Thread.sleep(1500);


                printTask("Mixing...");
                Thread.sleep(1500);


                inUse = false;
                printTask("Releasing mixing bowl and whisk!");
                notifyAll();

            printTask("Done!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public synchronized void makeFrosting() {
        try {
            while (inUse) {
                    printTask("Waiting for mixing bowl and whisk...");
                    wait();
            }

            printTask("Making frosting...");
            inUse = true;
            printTask("Adding butter...");
            Thread.sleep(200);

            printTask("Adding milk...");
            Thread.sleep(200);

            printTask("Adding sugar...");
            Thread.sleep(200);

            printTask("Adding vanilla extract...");
            Thread.sleep(200);

            printTask("Adding salt...");
            Thread.sleep(200);

            inUse = false;
            printTask("Releasing mixing bowl and whisk!");
            notifyAll();

            printTask("Done!");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    private void printTask(String task) {
        System.out.println(Thread.currentThread().getName() + " " + " - " + task);
    }
}
