package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

        float precoCarro = 30000F;

        for (int qtdParcelas = 1; qtdParcelas < precoCarro; qtdParcelas++) {
            float valorParcela = precoCarro / qtdParcelas;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Divido em " + qtdParcelas + " vezes: R$ " + valorParcela);
        }
    }
}