package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
         */
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

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