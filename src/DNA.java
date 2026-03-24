public class DNA {
    // Determines whether there is a protein in a strand of DNA

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3; // Muda aqui para testar cada uma

        // Comprimento da string
        int length = dna.length();

        // Encontrar o start codon (ATG) e stop codon (TGA)
        int startCodon = dna.indexOf("ATG");
        int stopCodon = dna.indexOf("TGA");

        // Verificar as 3 condições
        if (startCodon != -1 && stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {
            // Extrair a proteína (do ATG até ao fim do TGA)
            String protein = dna.substring(startCodon, stopCodon + 3);
            System.out.println("Contains a protein: " + protein);
        } else {
            System.out.println("No protein.");
        }
    }
}