package academy.devdojo.maratonajava.exercicios.polimorfismo.interfaceclassica.dominio;

public class SMS implements Notificavel {
    @Override
    public void enviarNotificacao() {
        System.out.println("SMS: Crazy Diamond! DORARARARARARARARAAAAA!");
    }
}