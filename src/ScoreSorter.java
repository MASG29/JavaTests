public class ScoreSorter {
    public static void main(String[] args) {

        int[] answer = scoreSorter(new int[]{1, 2, 3, 9999, 13}, 10000);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int[] scoreSorter(int[] array, int topScore) {
        // Write your code here
        // Cria uma array onde cada índice representa uma nota possível
        int[] contagemDasNotas = new int[topScore + 1];

        // Conta quantas vezes cada nota aparece
        for (int nota : array) {
            contagemDasNotas[nota]++;
        }

        int[] answer = new int[array.length];
        int index = 0;

        // Percorre a array de contagem de trás pra frente (maior para o menor)
        for (int nota = topScore; nota >= 0; nota--) {
            int quantidade = contagemDasNotas[nota];

            // Adiciona a nota na resposta o número de vezes que ela apareceu
            for (int i = 0; i < quantidade; i++) {
                answer[index] = nota;
                index++;
            }
        }

        return answer;
    }
}