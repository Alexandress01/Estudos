package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringTest01 {
    public static void main(String[] args) {
        // String constant pool
        String nome = "Alexandre";
        String nome2 = "Alexandre";

        nome = nome.concat(" Silva"); // nome += " Silva";

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Alexandre"); // 1º variável de ref., 2º objeto string, 3º string no pool

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
