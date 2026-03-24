package TavernaMedieval.Funcionarios;

import TavernaMedieval.Items.Comida;

public class Cozinheiro extends Pessoa{

    private String especialidade;

    public Cozinheiro(String name, int idade, String especialidade) {
        super(name, idade);
        if (especialidade.equals("Carnes") || especialidade.equals("Sopas") || especialidade.equals("Sobremesas")){
            this.especialidade = especialidade;
            funcionarios.add(this);
        } else {
            this.especialidade = "Sem especialidade";
            System.out.println("Nao admitimos cozinheiros sem especialidade, escolha entre \"Carnes, Sobremesas, Sopas\")");
        }
    }

    public void cook(Comida comida){
        if (comida.isCozinhado()){
            System.out.println("Esta comida já está pronta a ser servida");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hmmm deixa me ver, AHHH sim ja sei qual é a receita, mas vai demorar ");
        stringBuilder.append(comida.getTempo());
        stringBuilder.append(" Minutos");
        System.out.println(stringBuilder.toString());
        comida.setCozinhado(true);
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
        stringBuilder.append("Especialidade: ");
        stringBuilder.append(especialidade);
        return stringBuilder.toString();
    }
}
