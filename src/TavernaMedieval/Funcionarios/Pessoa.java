package TavernaMedieval.Funcionarios;

import java.util.ArrayList;

public abstract class Pessoa {
    protected String name;
    protected int idade;
    protected static ArrayList<Pessoa> funcionarios = new ArrayList<Pessoa>();

    protected Pessoa(String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    public static void apresentar(){
        for (Pessoa pessoa : funcionarios){
            System.out.println(pessoa);
        }
    }

    public static ArrayList<Pessoa> getFuncionarios(){
        return funcionarios;
    }

    public int getIdade() {
        return idade;
    }

    public abstract String toString();
}
