package listaLivro;

import java.util.ArrayList;
import java.util.List;


class Livro {
    private String titulo;
    private int anoDePublicacao;
    private Autor autor;
    private List<Capitulo> capitulos;
    private List<Imagem> imagens;

    public Livro(String titulo, int anoDePublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
        this.imagens = new ArrayList<>();
    }

    public void adicionarCapitulo(String tituloCapitulo, String conteudo) {
        Capitulo capitulo = new Capitulo(tituloCapitulo, conteudo);
        capitulos.add(capitulo);
    }

    public void adicionarImagem(Imagem imagem) {
        imagens.add(imagem);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }


    public List<Imagem> getImagens() {
        return imagens;
    }
}

