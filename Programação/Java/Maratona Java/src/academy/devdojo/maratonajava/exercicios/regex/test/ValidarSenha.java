package academy.devdojo.maratonajava.exercicios.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarSenha {
    public static void main(String[] args) {
        String senha = "1suasenha1";
        String regex = "^(?=.*\\d).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);

        if (matcher.matches()) {
            System.out.println("✔ Senha válida");
        } else {
            System.out.println("❌ Senha inválida");
        }
    }
}
