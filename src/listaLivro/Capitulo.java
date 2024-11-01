package listaLivro;

class Capitulo {
    private String titulo;
    private String conteudo;

    public Capitulo(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getConteudo() {
        return conteudo;
    }
}
