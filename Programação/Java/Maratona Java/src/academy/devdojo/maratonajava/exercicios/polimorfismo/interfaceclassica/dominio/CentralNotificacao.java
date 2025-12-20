package academy.devdojo.maratonajava.exercicios.polimorfismo.interfaceclassica.dominio;

public class CentralNotificacao {
    public static void notificar(Notificavel notificavel) {
        notificavel.enviarNotificacao();
    }
}