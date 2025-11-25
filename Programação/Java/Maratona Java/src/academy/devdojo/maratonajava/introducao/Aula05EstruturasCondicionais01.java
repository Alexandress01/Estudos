package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean autorizadoComprarBebida = idade >= 18;

        // estrutura condicional simples
        if (autorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if (!autorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        // estrutura condicional composta
        if (autorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
    }
}