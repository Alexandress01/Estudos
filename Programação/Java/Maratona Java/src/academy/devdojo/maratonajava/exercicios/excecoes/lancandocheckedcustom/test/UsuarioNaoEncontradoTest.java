package academy.devdojo.maratonajava.exercicios.excecoes.lancandocheckedcustom.test;

import academy.devdojo.maratonajava.exercicios.excecoes.lancandocheckedcustom.dominio.UsuarioNaoEncontradoException;

public class UsuarioNaoEncontradoTest {
    public static void main(String[] args) {
        try {
            logarUsuario(" ");
        } catch (UsuarioNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void logarUsuario(String usuario) throws UsuarioNaoEncontradoException {
        if (usuario == null || usuario.isBlank()) {
            throw new UsuarioNaoEncontradoException();
        }
    }
}