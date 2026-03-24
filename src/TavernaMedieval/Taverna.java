package TavernaMedieval;

import TavernaMedieval.Funcionarios.Cozinheiro;
import TavernaMedieval.Funcionarios.Pessoa;
import TavernaMedieval.Funcionarios.Servente;
import TavernaMedieval.Items.Bebida;
import TavernaMedieval.Items.Comida;
import TavernaMedieval.Items.Item;

import java.util.ArrayList;

public class Taverna {

    static void pedido(Comida comida, Bebida bebida){
        System.out.println("Pedido recebido com sucesso!");
        ArrayList<Item> conta = new ArrayList<Item>();
        conta.add(comida);
        conta.add(bebida);

        ArrayList<Cozinheiro> listaDeCozinheiros = new ArrayList<Cozinheiro>();
        ArrayList<Servente> listaDeServentes = new ArrayList<Servente>();

        for (Pessoa funcionario : Pessoa.getFuncionarios()){
            if (funcionario instanceof Cozinheiro){
                listaDeCozinheiros.add((Cozinheiro) funcionario);
            } else {
                listaDeServentes.add((Servente) funcionario);
            }
        }

        Cozinheiro delegarCozinheiro = listaDeCozinheiros.get((int) (Math.random() * (listaDeCozinheiros.size() - 1)));
        System.out.println("O seu cozinheiro será: " + delegarCozinheiro);

        Servente delegarServente = listaDeServentes.get((int) (Math.random() * (listaDeServentes.size() - 1)));
        System.out.println("O seu Servente será: " + delegarServente);

        delegarCozinheiro.cook(comida);
        delegarServente.servir(bebida);
        delegarServente.servir(comida);
        double totalconta = 0;
        for (Item item : conta){
            totalconta += item.getPreco();
        }

        System.out.println("Espero que tenha gostado, o total são: " + totalconta);
    }

    static void eleger(ArrayList<Pessoa> lista){

        Pessoa empregadoDoMes = Pessoa.getFuncionarios().getFirst();

        for (Pessoa pessoa : lista){
            if (pessoa.getIdade() > empregadoDoMes.getIdade()){
                empregadoDoMes = pessoa;
            }
        }

        System.out.println("O empregado do mês é: " + empregadoDoMes);

    }

    public static void main(String[] args) {

        Cozinheiro joao = new Cozinheiro("João", 24, "Carnes" );
        Cozinheiro joana = new Cozinheiro("Joana", 22, "Sobremesas");
        Cozinheiro joaquim = new Cozinheiro("Joaquim", 26, "Sopas");

        Servente marco = new Servente("Marco", 22, 5);
        Servente maria = new Servente("Maria", 25, 3);
        Servente mario =  new Servente("Mario", 18, 3);

        Pessoa.apresentar();

        Comida picanha = new Comida("Picanha", 25.50, 30);
        Comida sopaDaPedra = new Comida("Sopa da Pedra", 12.5, 40);
        Comida cheesecake = new Comida("Cheesecake", 4.99, 20);
        Comida strogonoff = new Comida("Strogonoff", 17.99, 35);

        Bebida agua = new Bebida("Água", 0.99, false);
        Bebida vinho = new Bebida("Vinho", 11.50, true);
        Bebida cerveja = new Bebida("Cerveja", 8.99, true);
        Bebida guarana = new Bebida("Guaraná", 3.99, false);

        Item.apresentarMenu();
        Item.mostrarAlcoolicas();

        pedido(picanha, vinho);
        eleger(Pessoa.getFuncionarios());
    }
}
