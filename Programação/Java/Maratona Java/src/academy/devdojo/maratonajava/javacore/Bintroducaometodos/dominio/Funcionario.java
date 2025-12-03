package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public float[] salarios;

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
        float mediaSalarios = 0;
        for (float salario : salarios) {
            mediaSalarios += salario;
        }

        mediaSalarios /= salarios.length;

        System.out.println("\nA média salarial é: " + mediaSalarios);
    }
}