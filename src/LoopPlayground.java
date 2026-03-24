import java.util.ArrayList;
import java.util.Arrays;

public class LoopPlayground {
    public static void main(String[] args) {

        // === 🎵 PLAYLIST DE MÚSICAS ===
        ArrayList<String> playlist = new ArrayList<String>(Arrays.asList(
                "Bohemian Rhapsody", "Stairway to Heaven", "Hotel California",
                "Imagine", "Smells Like Teen Spirit", "Hey Jude",
                "Back in Black", "Sweet Child O' Mine", "Thriller", "Wonderwall"
        ));

        // === 🏆 JOGADORES E GOLOS ===
        ArrayList<String> jogadores = new ArrayList<String>(Arrays.asList(
                "Ronaldo", "Messi", "Neymar", "Mbappé", "Haaland",
                "Salah", "De Bruyne", "Vinícius Jr", "Bellingham", "Gyökeres"
        ));
        ArrayList<Integer> golos = new ArrayList<Integer>(Arrays.asList(
                899, 850, 440, 301, 267, 320, 110, 185, 89, 75
        ));

        // === 🎒 INVENTÁRIO DE RPG ===
        ArrayList<String> inventario = new ArrayList<String>(Arrays.asList(
                "espada", "poção de vida", "escudo", "arco", "poção de mana",
                "anel mágico", "poção de vida", "capacete", "poção de vida", "botas"
        ));
        ArrayList<Integer> precos = new ArrayList<Integer>(Arrays.asList(
                150, 30, 100, 120, 25, 200, 30, 80, 30, 60
        ));

        // === 🎲 NOTAS DE ALUNOS ===
        ArrayList<String> alunos = new ArrayList<String>(Arrays.asList(
                "Ana", "Bruno", "Carlos", "Diana", "Eduardo",
                "Filipa", "Gonçalo", "Helena", "Igor", "Joana"
        ));
        ArrayList<Integer> notas = new ArrayList<Integer>(Arrays.asList(
                18, 9, 14, 7, 16, 12, 5, 19, 11, 20
        ));

        // ==========================================
        //  🚀 PRATICA AQUI EM BAIXO!
        // ==========================================

        // DESAFIO 1: Percorre a playlist e imprime cada música com o número
        //   Exemplo: "1. Bohemian Rhapsody"

        for (String musics : playlist) {
            System.out.println((playlist.indexOf(musics) + 1) + ". " + musics);
        }

        // DESAFIO 2: Encontra o jogador com mais golos
        //   Dica: usa um for loop e compara com uma variável "maxGolos"

        int maxGolos = golos.get(0);
        String melhorJogador = jogadores.get(0);

        for (int i = 1; i < jogadores.size(); i++) {
            if (golos.get(i) > maxGolos){
                maxGolos = golos.get(i);
                melhorJogador = jogadores.get(i);
            }
            // Se o jogador atual tiver mais golos que o máximo...
            //   atualiza maxGolos e melhorJogador
        }

        System.out.println(melhorJogador + " com " + maxGolos + " golos!");


        // DESAFIO 3: Conta quantas "poção de vida" existem no inventário

        int contadorDePocoes = 0;

        for(String item : inventario){
            if (item.equals("poção de vida")){
                contadorDePocoes++;
            }
        }
        System.out.println(contadorDePocoes);

        // DESAFIO 4: Calcula o preço total do inventário

        int total = 0;

        for(int precoPItem : precos){
            total += precoPItem;
        }
        System.out.println(total);


        // DESAFIO 5: Imprime só os alunos que passaram (nota >= 10)

        for (int i = 0; i < alunos.size(); i++) {
            if(notas.get(i) >= 10){
                System.out.println(alunos.get(i));
            }

        }

        // DESAFIO 6: Calcula a média das notas

        int totalNotas = 0;
        for(int notas1 : notas){
            totalNotas += notas1;
        }
        double media = (double) totalNotas / notas.size();
        System.out.println(media);

        // DESAFIO 7: Inverte a playlist (sem usar Collections.reverse!)

        for (int i = 0; i < playlist.size() / 2; i++) {
            int indexOfLast = playlist.size() - 1 - i;
            String first = playlist.get(i);
            String last = playlist.get(indexOfLast);
            playlist.set(i, last);
            playlist.set(indexOfLast, first);
        }
        System.out.println(playlist);

        // DESAFIO 8: Remove todos os itens do inventário que custam menos de 50
        //   Cuidado: remover elementos enquanto fazes loop pode dar problemas!
        //   Dica: tenta percorrer de trás para a frente

        for (int i = precos.size() - 1; i >= 0 ; i--) {
            int precoatual = precos.get(i);
            if (precoatual < 50){
                inventario.remove(i);
                precos.remove(i);
            }

        }
        System.out.println(inventario);
        System.out.println(precos);

        // DESAFIO 9: Cria uma nova lista só com os jogadores que têm mais de 300 golos

        ArrayList<String> maisDe300 = new ArrayList<String>();

        for (int i = 0; i < jogadores.size() ; i++) {
            int golosatual = golos.get(i);
            if (golosatual > 300){
                maisDe300.add(jogadores.get(i));
            }
        }
        System.out.println(maisDe300);

        // DESAFIO 10 (BOSS FINAL): Ordena os alunos por nota (do maior para o menor)
        //   Dica: pesquisa "bubble sort" - usa dois for loops




    }
}