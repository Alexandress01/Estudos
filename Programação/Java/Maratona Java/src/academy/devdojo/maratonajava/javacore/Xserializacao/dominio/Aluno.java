package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 142411672908976812L;
    private Long id;
    private String nome;
    private transient String senha;
    private static final String NOME_ESCOLA = "DevDojo viradão no Jiraya";
    private transient Turma turma;

    public Aluno(Long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
