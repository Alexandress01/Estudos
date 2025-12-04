package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private float[] salarios;
    private float media;


    public void imprimeDados() {
        if (salarios == null) {
            System.out.println("[ERRO] Informe pelo menos um salário!");
        } else {
            System.out.println("----------------------------");
            System.out.println(this.nome);
            System.out.println(this.idade);

            for (float salario : salarios) {
                System.out.print(salario + " ");
            }
            imprimeMediaSalario();
        }
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        for (float salario : salarios) {
            media += salario;
        }

        media /= salarios.length;

        System.out.println("\nA média salarial é: " + media);
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(float[] salarios) {
        this.salarios = salarios;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float[] getSalarios() {
        return salarios;
    }

    public float getMedia() {
        return media;
    }
}