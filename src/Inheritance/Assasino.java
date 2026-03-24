package Inheritance;

public class Assasino extends Personagem {

    private int furtividade;

    public Assasino(String nome, int vida, int furtividade){
        super(nome, vida, "Assasino");
        this.furtividade = furtividade;
    }

    @Override
    public String atacar(){
        return nome + " ataca das sombras com furtividade " + furtividade;
    }

    @Override
    public String toString() {
        return super.toString() + " | Furtividade: " + furtividade;
    }

}
