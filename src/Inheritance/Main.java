// ==========================================
// 📚 RESUMO: INHERITANCE & POLYMORPHISM
// ==========================================
//
// HERANÇA (Inheritance):
//   - Uma classe filha (child) herda campos e métodos da classe pai (parent)
//   - Usa-se "extends" para herdar: class Dog extends Animal {}
//   - O construtor do pai é chamado com super()
//   - Cada classe precisa do seu próprio ficheiro .java
//
// MODIFICADORES DE ACESSO:
//   - protected: a classe filha PODE aceder
//   - private: a classe filha NÃO pode aceder
//   - final: o método/campo NÃO pode ser alterado pela classe filha
//
// POLIMORFISMO (Polymorphism):
//   - Um objeto da classe filha pode ser tratado como se fosse da classe pai
//   - Exemplo: Animal a = new Dog(); → funciona!
//   - Métodos podem ser sobrescritos (override) na classe filha
//   - Usa-se @Override antes do método para indicar que estás a sobrescrever
//
// ARRAYS/ARRAYLISTS:
//   - Objetos de classes filhas diferentes podem estar juntos num ArrayList
//     do tipo da classe pai
//   - Exemplo: ArrayList<Animal> animais pode ter Dog, Cat, Bird, etc.
// ==========================================
package Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void batalha(Personagem p1, Personagem p2){
        int vidap1 = p1.getVida();
        int vidap2 = p2.getVida();
        if (vidap1 > vidap2){
            System.out.println("Quem tem mais vida e : \n" + p1);
        } else {
            System.out.println("Quem tem mais vida e : \n" + p2);
        }

    }
    public static void main(String[] args) {

        // ==========================================
        //  🚀 TESTA AQUI EM BAIXO!
        // ==========================================

        // DESAFIO 1: Cria um Guerreiro e um Mago e imprime as suas stats
        //   Dica: usa o construtor com nome, vida e o atributo específico

        Guerreiro spartacus = new Guerreiro("Spartacus", 250, 10);
        Mago harryPotter = new Mago("Harry Potter", 100, 18);
        System.out.println(spartacus);
        System.out.println(harryPotter);

        // DESAFIO 2: Faz cada personagem atacar usando o método atacar()
        //   Nota como cada classe tem o seu próprio estilo de ataque (polimorfismo!)

        System.out.println(spartacus.atacar());
        System.out.println(harryPotter.atacar());

        // DESAFIO 3: Cria um ArrayList<Personagem> e adiciona diferentes personagens
        //   Dica: podes misturar Guerreiro, Mago e Arqueiro na mesma lista

        Arqueiro robinHood = new Arqueiro("Robin Hood", 130, 15);
        ArrayList<Personagem> personagens = new ArrayList<Personagem>();
        personagens.add(spartacus);
        personagens.add(harryPotter);
        personagens.add(robinHood);

        // DESAFIO 4: Percorre a lista e faz cada personagem atacar()
        //   Nota: mesmo sendo uma lista de "Personagem", cada um ataca à sua maneira!

        for (Personagem personagem : personagens) {
            System.out.println(personagem.atacar());
        }

        // DESAFIO 5: Percorre a lista e imprime a info de cada personagem
        //   Dica: usa o método toString() — já está sobrescrito em cada classe

        for (Personagem personagem : personagens) {
            System.out.println(personagem);
        }


        // DESAFIO 6: Cria um método estático nesta classe chamado batalha()
        //   Recebe dois Personagem e imprime quem tem mais vida
        //   Dica: public static void batalha(Personagem p1, Personagem p2)

        batalha(spartacus, harryPotter);


        // DESAFIO 7: Tenta chamar getPoderMagico() num objeto do tipo Personagem
        //   O que acontece? Porquê?
        //   Dica: Personagem mago = new Mago("Gandalf", 80, 100);
        //         mago.getPoderMagico(); // funciona?

        Personagem mago = new Mago("Gandalf", 80, 100);
        //mago.getPoderMagico();


        // DESAFIO 8 (BOSS FINAL): Cria uma nova classe filha "Assassino"
        //   - Atributo extra: int furtividade
        //   - Override do método atacar(): "X ataca das sombras com furtividade Y!"
        //   - Cria um Assassino.java e testa-o aqui

        Assasino blade = new Assasino("Blade", 80, 25);
        System.out.println(blade);
        System.out.println(blade.atacar());

    }
}