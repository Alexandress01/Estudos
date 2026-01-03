package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        /* Meta caracteres
          \d = Todos os dígitos (números)
          \D = Tudo que não for dígito (número)
          \s = Todos os espaços em branco (\t, \n, \f, \r)
          \S = Todos os caracteres, excluindo os brancos
          \w = a-ZA-Z, digitos, _
          \W = Tudo que não for incluso no \w
          [] = Range
          ? = Zero ou uma ocorrência
          * = Zero ou mais ocorrências
          + = Uma ou mais ocorrências
          {n, m} = De n até m
          () = Agrupamento
          | = Ou Ex: o(v|c)o dá match em ovo ou oco
          $ = Fim da linha
          . = Coringa; qualquer caracter entre Ex: 1.3 busca 123, 133, 1@3, 1A3...
         */
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "goku@hotmail.com, 123jotaro@gmail.com, #@!yuu@mail.br, teste@gmail.com.br, nobara@mail";

        System.out.println("Email válido:");
        System.out.println("yuu@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas:");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}