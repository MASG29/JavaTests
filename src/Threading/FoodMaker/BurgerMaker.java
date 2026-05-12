package Threading.FoodMaker;

import java.lang.Thread;
public class BurgerMaker {

    public void toastBuns() {
        try {
            System.out.println("Toasting buns...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void grillPatty() {
        System.out.println("Grilling patty...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void meltCheese() {
        System.out.println("Melting cheese...");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void fryOnions() {
        System.out.println("Frying onions...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void assembleBurger() {
        System.out.println("Assembling burger...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        BurgerMaker burgerMaker = new BurgerMaker();
        Thread t1 = new Thread(() -> burgerMaker.toastBuns());
        Thread t2 = new Thread(() -> burgerMaker.grillPatty());
        Thread t3 = new Thread(() -> burgerMaker.meltCheese());
        Thread t4 = new Thread(() -> burgerMaker.fryOnions());
        Thread t5 = new Thread(() -> burgerMaker.assembleBurger());

        try {
        t1.start();
        t2.start();
        t4.start();
        t2.join(); // must grill patty before melting cheese on it
        t3.start(); // ready to melt cheese
        t1.join();
        t3.join();
        t4.join();
        // must complete all other steps before assembling burger
        t5.start();
        t5.join(); // waiting for the burger assembly task to complete
        System.out.println("Burger complete!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}