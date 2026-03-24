package Inheritance;

// Classe FILHA — herda de Personagem
public class Guerreiro extends Personagem {

    // Atributo exclusivo do Guerreiro
    private int forca;

    public Guerreiro(String nome, int vida, int forca) {
        // Chama o construtor do pai com super()
        super(nome, vida, "Guerreiro");
        this.forca = forca;
    }

    // Override do método atacar — polimorfismo!
    @Override
    public String atacar() {
        return nome + " ataca com a espada! Força: " + forca;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public String toString() {
        return super.toString() + " | Força: " + forca;
    }
}