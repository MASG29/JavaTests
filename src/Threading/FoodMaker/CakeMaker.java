package Threading.FoodMaker;

public class CakeMaker {
        Oven oven;
        MixingBowl mixingBowl;


        CakeMaker() {
        this.oven = new Oven();
        this.mixingBowl = new MixingBowl();
        }
    /* Main Method */
    public static void main(String[] args) {

        CakeMaker c = new CakeMaker();
        try {

            Thread preheatOven = new Thread(c::preheatOven, "preheatOven");
            Thread mixDryIngredients = new Thread(c::mixDryIngredients, "mixDryIngredients");
            Thread mixWetIngredients = new Thread(c::mixWetIngredients, "mixWetIngredients");
            Thread combineIngredients = new Thread(c::combineIngredients, "combineIngredients");
            Thread bakeCake = new Thread(c::bakeCake, "bakeCake");
            Thread makeFrosting = new Thread(c::makeFrosting, "makeFrosting");
            Thread frostCake = new Thread(c::frostCake, "frostCake");

            preheatOven.start();
            mixDryIngredients.start();
            mixWetIngredients.start();
            makeFrosting.start();
            mixDryIngredients.join();
            mixWetIngredients.join();
            combineIngredients.start();
            combineIngredients.join();
            preheatOven.join();
            bakeCake.start();
            makeFrosting.join();
            bakeCake.join();
            frostCake.start();
            frostCake.join();
            System.out.println("Cake complete!");
        } catch (Exception e) {
            System.out.println(e);
        }
    } // End of Main

    /* Instance Methods */
    private  void preheatOven(){
        oven.preheatOven();
    }
    private  void bakeCake() {
        oven.bakeCake();
    }
    private  void mixDryIngredients() {
        mixingBowl.mixDryIngredients();
    }
    private  void mixWetIngredients() {
        mixingBowl.mixWetIngredients();
    }
    private  void combineIngredients() {
        mixingBowl.combineIngredients();
    }
    private  void makeFrosting() {
        mixingBowl.makeFrosting();
    }

    private void frostCake() {
        try {
            printTask("Frosting cake...");
            Thread.sleep(1500);
            printTask("Done!");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    private void printTask(String task) {
        System.out.println(Thread.currentThread().getName() + " " + " - " + task);
    }
}
