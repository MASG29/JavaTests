package TavernaMedieval.Items;

import TavernaMedieval.Funcionarios.Pessoa;

import java.util.ArrayList;

public  abstract class Item {

    protected String name;
    protected double preco;
    protected static ArrayList<Item> menu = new ArrayList<Item>();
    protected Item(String name, double preco){
        this.name = name;
        this.preco = preco;
    }

    public static void apresentarMenu(){
        System.out.println("Aqui tem o nosso Menu:");
        double total = 0;
        for (Item item : menu){
            System.out.println(item);
            total += item.getPreco();
        }
        System.out.println("O menu tem um preço total de: ");
        System.out.printf("%.2f€%n", total);
    }

    public double getPreco() {
        return preco;
    }

    public static void mostrarAlcoolicas(){
        System.out.println("Aqui tem a nossa lista de bebida alcoólicas:");
        for (Item item : menu){
            if (item instanceof Bebida && ((Bebida) item).isAlcoolica()){
                System.out.println(item);
            }


        }
    }

    public abstract String toString();


}
