package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Alexandre Silva";
        nome.concat("Santos");
        nome.substring(0, 3);

        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Alexandre Silva");
        sb.append(" Aleki").append(" DevJava");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);

        System.out.println(sb);
    }
}
