package academy.devdojo.maratonajava.exercicios.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtrairHashtags {
    public static void main(String[] args) {
        String texto = "Aprendendo #Java e #Regex no #DevDojo";
        String regex = "#[A-Za-z]+(?=\\s|$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
