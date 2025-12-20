package academy.devdojo.maratonajava.exercicios.polimorfismo.interfaceclassica.dominio;

public class Email implements Notificavel {
    @Override
    public void enviarNotificacao() {
        System.out.println("Email: Killer Queen, Daisan no Bakudan, Bite za Dusto...");
    }
}