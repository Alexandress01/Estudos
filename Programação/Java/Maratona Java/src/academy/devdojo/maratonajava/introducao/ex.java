package academy.devdojo.maratonajava.introducao;

public class ex {
    public static void main(String[] args) {
        // ex1: somar todos os elementos
        int[][] numeros = {
                {12, 18, 21},
                {62, 4, 20},
                {16, 7, 2}
        };

        int soma = 0;

        for (int[] arrayzao : numeros) {
            for (int numero : arrayzao) {
                soma += numero;
            }
        }
        System.out.println("A soma de todos os elementos é: " + soma);

        System.out.println("--------------------------------------");

        // ex2: contar números pares
        int[][] nums = {
                {2, 5},
                {7, 9},
                {10, 4}
        };

        int pares = 0;
        for (int[] arrayBase : nums) {
            for (int num : arrayBase) {
                if (num % 2 == 0) {
                    pares++;
                }
            }
        }
        System.out.println("A matriz tem " + pares + " números pares");
    }
}