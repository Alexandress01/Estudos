package academy.devdojo.maratonajava.exercicios.modificadoracesso.dominio;

public class Aluno {
    private String nome;
    private float nota;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.nota);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    // Setters

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("[ERRO] Digite um nome!");
            return;
        } else {
            this.nome = nome;
        }
    }

    public void setNota(float nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("[ERRO] Nota Inválida! Digite valores entre 0 e 10");
        }
    }
}