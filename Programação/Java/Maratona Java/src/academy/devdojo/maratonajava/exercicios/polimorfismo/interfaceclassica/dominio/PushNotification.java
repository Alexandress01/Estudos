package academy.devdojo.maratonajava.exercicios.polimorfismo.interfaceclassica.dominio;

public class PushNotification implements Notificavel {
    @Override
    public void enviarNotificacao() {
        System.out.println("PushNotification: Killer Queen! SHIBO-BO-BO-BO-BO-BO!");
    }
}