package academy.devdojo.maratonajava.exercicios.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalavraCincoADez {
    public static void main(String[] args) {
        String palavra = "Cavalo";
        String regex = "^[A-Za-z]{5,10}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palavra);

        if (matcher.matches()) {
            System.out.println("✔ Palavra válida");
        } else {
            System.out.println("❌ Palavra inválida");
        }
    }
}