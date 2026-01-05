package academy.devdojo.maratonajava.exercicios.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoNumeros {
    public static void main(String[] args) {
        String texto = "2140583394";
        String regex = "^\\d+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);

        if (matcher.matches()) {
            System.out.println("✔ Contém apenas números");
        } else {
            System.out.println("❌ Não contém apenas números");
        }
    }
}