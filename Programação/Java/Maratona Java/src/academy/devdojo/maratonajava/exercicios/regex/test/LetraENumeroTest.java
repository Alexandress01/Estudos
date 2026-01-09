package academy.devdojo.maratonajava.exercicios.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetraENumeroTest {
    public static void main(String[] args) {
        String texto = "abAcax!1";
        String regex = "^[A-Za-z].*\\d$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.matches()) {
            System.out.println("✔ Texto válido");
        } else {
            System.out.println("❌ Texto inválido");
        }
    }
}