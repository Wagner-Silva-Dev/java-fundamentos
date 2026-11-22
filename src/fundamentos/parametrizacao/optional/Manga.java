package fundamentos.parametrizacao.optional;

public class Manga {
    private Integer id;
    private String titulo;

    public Manga(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "titulo='" + titulo + '\'' +
                ", ID=" + id +
                '}';
    }

    public String getTitulo() {return titulo;}
    public Integer getId() {return id;}
}