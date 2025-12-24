package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}