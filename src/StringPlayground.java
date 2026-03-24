public class StringPlayground {
    public static void main(String[] args) {

        // === 🎮 DADOS PARA BRINCAR ===
        String heroi = "Geralt of Rivia";
        String vilao = "Eredin Bréacc Glas";
        String feitico = "igni";
        String grito = "WINDS HOWLING";
        String frase = "Toss a coin to your Witcher, O Valley of Plenty";
        String password = "SilverSword123";
        String passwordConfirm = "silversword123";

        // ==========================================
        //  🚀 PRATICA AQUI EM BAIXO!
        // ==========================================

        // DESAFIO 1: Imprime o número de caracteres do nome do herói
        //   Dica: usa length()


        // DESAFIO 2: Junta o nome do herói com " vs " e o nome do vilão numa só string
        //   Dica: usa concat()
        //   Resultado esperado: "Geralt of Rivia vs Eredin Bréacc Glas"


        // DESAFIO 3: Encontra a posição da palavra "Witcher" na frase
        //   Dica: usa indexOf()


        // DESAFIO 4: Descobre qual é a primeira e última letra do nome do herói
        //   Dica: usa charAt() com índice 0 e length() - 1


        // DESAFIO 5: Verifica se as duas passwords são iguais (case sensitive)
        //   Depois verifica ignorando maiúsculas/minúsculas
        //   Dica: usa equals() e equalsIgnoreCase()


        // DESAFIO 6: Extrai só o primeiro nome do herói ("Geralt")
        //   Dica: usa substring() - precisa do índice inicial e final
        //   Extra: tenta usar indexOf(" ") para encontrar o espaço automaticamente


        // DESAFIO 7: Transforma o feitiço para MAIÚSCULAS e o grito para minúsculas
        //   Dica: usa toUpperCase() e toLowerCase()


        // DESAFIO 8: Verifica se a frase começa com "Toss" e acaba com "Plenty"
        //   Dica: usa substring() para extrair os primeiros/últimos caracteres
        //   e depois compara com equals()


        // DESAFIO 9: Conta quantas vezes a letra "a" aparece no nome do vilão
        //   Dica: usa charAt() num loop com length()


        // DESAFIO 10 (BOSS FINAL): Cria um sistema de validação de password:
        //   - Tem de ter pelo menos 8 caracteres (length)
        //   - Tem de conter pelo menos uma letra maiúscula
        //   - Tem de conter pelo menos um número (charAt entre '0' e '9')
        //   Imprime "Password válida!" ou "Password inválida!"
        //   Dica: percorre a password com um loop e charAt()


    }
}