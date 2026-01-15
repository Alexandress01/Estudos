package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo != null
    // Simétrico: para x e y != null, se x.equals(y) == true, logo y.equals(x) == true
    // Transitividade: para x, y, z != null, se x.equals(y) == true e x.equals(z) == true, logo y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x != null
    // para x != null, x.equals(num) tem que retornar false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
