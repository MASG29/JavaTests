package Inheritance;

// Classe FILHA — herda de Personagem
public class Mago extends Personagem {

    // Atributo exclusivo do Mago
    private int poderMagico;

    public Mago(String nome, int vida, int poderMagico) {
        super(nome, vida, "Mago");
        this.poderMagico = poderMagico;
    }

    @Override
    public String atacar() {
        return nome + " lança um feitiço! Poder Mágico: " + poderMagico;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    @Override
    public String toString() {
        return super.toString() + " | Poder Mágico: " + poderMagico;
    }
}