package Inheritance;

// Classe PAI (parent class)
public class Personagem {

    // Campos protegidos — as classes filhas podem aceder
    protected String nome;
    protected int vida;

    // Campo final — NÃO pode ser alterado pelas classes filhas
    protected final String tipo;

    // Construtor
    public Personagem(String nome, int vida, String tipo) {
        this.nome = nome;
        this.vida = vida;
        this.tipo = tipo;
    }

    // Método que as classes filhas vão sobrescrever (override)
    public String atacar() {
        return nome + " ataca!";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public String getTipo() {
        return tipo;
    }

    // toString sobrescrito para print fácil
    @Override
    public String toString() {
        return tipo + " | " + nome + " | Vida: " + vida;
    }
}