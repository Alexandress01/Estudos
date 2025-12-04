package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private String estudio;
    private String base;

    public Anime(String nome, String genero, int episodios, String estudio) {
        this();
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.estudio = estudio;
    }

    public Anime(String nome, String genero, int episodios, String estudio, String base) {
        this(nome, genero, episodios, estudio);
        this.base = base;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
        System.out.println(this.base);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }
}
