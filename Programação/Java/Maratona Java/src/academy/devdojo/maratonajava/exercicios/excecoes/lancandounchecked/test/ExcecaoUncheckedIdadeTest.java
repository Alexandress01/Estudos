package academy.devdojo.maratonajava.exercicios.excecoes.lancandounchecked.test;

public class ExcecaoUncheckedIdadeTest {
    public static void main(String[] args) {
        validarIdade(17);
    }

    public static void validarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade inválida: deve ser maior ou igual a 18");
        }
    }
}