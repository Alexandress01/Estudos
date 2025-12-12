package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua Jardim das Laranjeiras");
        endereco.setCep("40028-922");

        Pessoa pessoa = new Pessoa("Aleki");

        pessoa.setCpf("012.345.678-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Carlão Caminhoneiro");

        funcionario.setCpf("00.876.543-21");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(7550.33);

        System.out.println("---------------------");

        funcionario.imprime();
    }
}
