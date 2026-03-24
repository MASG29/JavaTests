package TavernaMedieval.Funcionarios;

import TavernaMedieval.Items.Bebida;
import TavernaMedieval.Items.Comida;

public class Servente extends Pessoa{

    private int nummesas;

    public Servente(String name, int idade, int mesas){
        super(name, idade);
        this.nummesas = mesas;
        funcionarios.add(this);
    }

    public void servir(Comida comida){
        if (comida.isCozinhado()){
            System.out.println("Aqui tem a sua " + comida + "\nBom apetite.");
        }
    }

    public void servir(Bebida bebida){
        System.out.println("Aqui tem a sua " + bebida + "\nDesfrute.");
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Nome: ");
        stringBuilder.append(name);
        stringBuilder.append(" | ");
        stringBuilder.append("Idade: ");
        stringBuilder.append(idade);
        stringBuilder.append(" | ");
        stringBuilder.append("A servir: ");
        stringBuilder.append(nummesas);
        stringBuilder.append(" mesas");
        return stringBuilder.toString();
    }
}
