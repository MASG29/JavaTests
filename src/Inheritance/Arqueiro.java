package Inheritance;

// Classe FILHA — herda de Personagem
public class Arqueiro extends Personagem {

    // Atributo exclusivo do Arqueiro
    private int precisao;

    public Arqueiro(String nome, int vida, int precisao) {
        super(nome, vida, "Arqueiro");
        this.precisao = precisao;
    }

    @Override
    public String atacar() {
        return nome + " dispara uma flecha! Precisão: " + precisao;
    }

    public int getPrecisao() {
        return precisao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Precisão: " + precisao;
    }
}