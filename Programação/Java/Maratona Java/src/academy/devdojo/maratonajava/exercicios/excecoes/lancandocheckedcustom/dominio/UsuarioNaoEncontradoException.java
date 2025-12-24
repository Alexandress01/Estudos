package academy.devdojo.maratonajava.exercicios.excecoes.lancandocheckedcustom.dominio;

public class UsuarioNaoEncontradoException extends Exception {
    public UsuarioNaoEncontradoException() {
        super("Usuário não encontrado: verifique os dados e tente novamente.");
    }

    public UsuarioNaoEncontradoException(String msg) {
        super(msg);
    }
}