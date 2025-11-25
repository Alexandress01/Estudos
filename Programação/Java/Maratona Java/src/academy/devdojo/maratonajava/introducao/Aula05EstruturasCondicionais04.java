package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        float salario = 70000F;
        double taxa1 = 0.097;
        double taxa2 = 0.3735;
        double taxa3 = 0.4950;
        double valorImposto;

        if (salario <= 34712) {
            valorImposto = salario * taxa1;
            System.out.printf("Valor do imposto: " + valorImposto);
        } else if (salario > 34712 && salario <= 68587) {
            valorImposto = salario * taxa2;
            System.out.printf("Valor do imposto: " + valorImposto);
        } else {
            valorImposto = salario * taxa3;
            System.out.printf("Valor do imposto: " + valorImposto);
        }
    }
}