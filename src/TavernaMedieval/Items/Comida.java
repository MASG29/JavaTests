package TavernaMedieval.Items;

public class Comida extends Item{

    private int tempo;
    private boolean cozinhado;

    public Comida(String name, double preco, int tempo){
        super(name, preco);
        this.tempo = tempo;
        menu.add(this);
    }

    public double getTempo() {
        return tempo;
    }


    public boolean isCozinhado() {
        return cozinhado;
    }

    public void setCozinhado(boolean cozinhado) {
        this.cozinhado = cozinhado;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Comida: ");
        stringBuilder.append(name);
        stringBuilder.append(" | ");
        stringBuilder.append("Preço: ");
        stringBuilder.append(preco);
        stringBuilder.append("€");
        stringBuilder.append(" | ");
        stringBuilder.append("Tempo de preparo: ");
        stringBuilder.append(tempo);
        stringBuilder.append(" minutos");
        return stringBuilder.toString();
    }
}
