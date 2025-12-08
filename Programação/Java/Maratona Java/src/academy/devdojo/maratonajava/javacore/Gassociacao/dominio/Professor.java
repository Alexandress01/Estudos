package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("-----------------------");
        System.out.println("Professor: " + this.nome);

        if (seminarios == null) {
            return;
        } else {
            System.out.println("## Seminários Cadastrados ##");
            for (Seminario seminario : this.seminarios) {
                System.out.println("Título: " + seminario.getTitulo());
                System.out.println("Local: " + seminario.getLocal().getEndereco());

                if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) {
                    continue;
                } else {
                    System.out.println("** Alunos **");
                    for (Aluno aluno : seminario.getAlunos()) {
                        System.out.println("Aluno: " + aluno.getNome() + " Idade: " + aluno.getIdade());
                    }
                }
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }
}
