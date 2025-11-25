package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // aritiméticos: + (soma), - (subtração), / (divisão), * (multiplicação)
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println(resultado);

        // relacionais: % (resto), < (menor), > (maior), <= (menor ou igual),
        // >= (maior ou igual), == (igual), != (diferente)
        int resto = 21 % 2;
        System.out.println(resto);

        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte? " + isDezMaiorVinte);
        System.out.println("isDezMenorQueVinte? " + isDezMenorVinte);
        System.out.println("isDezIgualVinte? " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte? " + isDezDiferenteVinte);

        // lógicos: && (AND), || (OR), ! (NOT)
        int idade = 35;
        float salario = 3500F;                   // usando o AND
        boolean DentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean DentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta? " + DentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta? " + DentroDaLeiMenorQueTrinta);

        double valorTotalCorrente = 2000;
        double valorTotalPoupanca = 10000;
        float precoPlayStation5 = 5000F;
        boolean playStation5Compravel = valorTotalCorrente >= precoPlayStation5 || valorTotalPoupanca >= precoPlayStation5;

        System.out.println("playStationCompravel? " + playStation5Compravel);

        // atribuição: =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // unário: ++, -- (a ordem importa)
        int contador = 0;
        contador += 1;
        contador++; // contador = contador + 1;
        contador--; // contador = contador - 1;
        System.out.println(contador);
    }
}