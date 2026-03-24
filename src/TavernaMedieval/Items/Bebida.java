package TavernaMedieval.Items;

public class Bebida extends Item{

    private boolean alcoolica;

    public Bebida(String name, double preco, boolean alcoolica){
        super(name, preco);
        this.alcoolica = alcoolica;
        menu.add(this);
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Bebida: ");
        stringBuilder.append(name);
        stringBuilder.append(" | ");
        stringBuilder.append("Preço: ");
        stringBuilder.append(preco);
        stringBuilder.append("€");
        stringBuilder.append(" | ");
        stringBuilder.append("É alcoólica: ");
        stringBuilder.append(alcoolica ? "Sim" : "Não");
        return stringBuilder.toString();
    }
}
