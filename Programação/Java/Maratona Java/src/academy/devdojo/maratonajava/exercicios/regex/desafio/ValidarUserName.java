package academy.devdojo.maratonajava.exercicios.regex.desafio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarUserName {
    public static void main(String[] args) {
        String username = "User123456789012";
        String regex = "^[A-Za-z][A-Za-z0-9]{2,15}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        if (matcher.matches()) {
            System.out.println("✔ Username válido");
        } else {
            System.out.println("❌ Username inválido");
        }
    }
}
