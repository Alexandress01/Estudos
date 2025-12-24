package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner input = new Scanner(System.in);

        String usernameDB = "Goku";
        String senhaDB = "Ssj";

        System.out.println("Usuário:");
        String usernameDigitado = input.nextLine();

        System.out.println("Senha:");
        String senhaDigitada = input.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos. Verifique e tente novamente.");
        }

        System.out.println("Login efetuado com sucesso!");
    }
}
