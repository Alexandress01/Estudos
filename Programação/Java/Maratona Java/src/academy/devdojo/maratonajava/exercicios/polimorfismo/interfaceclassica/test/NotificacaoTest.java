package academy.devdojo.maratonajava.exercicios.polimorfismo.interfaceclassica.test;

import academy.devdojo.maratonajava.exercicios.polimorfismo.interfaceclassica.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class NotificacaoTest {
    public static void main(String[] args) {
        List<Notificavel> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());
        notificacoes.add(new PushNotification());

        for (Notificavel notificacao : notificacoes) {
            notificacao.enviarNotificacao();
        }
    }
}