package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Alexandre";
        String endereco = "Rua Jardim Ipanema 08, Pitangueiras";
        float salario = 2530.45F;
        String dataRecebimento = "22/11/2025";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + "; confirmo que recebi o salário de " + salario + ", na data " + dataRecebimento);
        // forma formatada
        System.out.printf("Eu %s, morando no endereço %s; confirmo que recebi o salário de %.2f, na data %s", nome, endereco, salario, dataRecebimento);
    }
}