package academy.devdojo.maratonajava.exercicios.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarEmailTest {
    public static void main(String[] args) {
        String email = "alekidevsupremo@gmail.com";
        String regex = "^[\\w._+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("✔ E-mail válido");
        } else {
            System.out.println("❌ E-mail inválido");
        }
    }
}