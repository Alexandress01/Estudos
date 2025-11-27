package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // valores padrões: byte, short, int, long, float e double = 0
        // char = 'u\u0000' (nada)
        // boolean = false
        // tipos reference (ex. String) = null

        String [] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
