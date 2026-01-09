package academy.devdojo.maratonajava.exercicios.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCEPTest {
    public static void main(String[] args) {
        String texto = "42711-123";
        String regex = "^\\d{5}-?\\d{3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.matches()) {
            System.out.println("✔ CEP válido");
        } else {
            System.out.println("❌ CEP inválido");
        }
    }
}