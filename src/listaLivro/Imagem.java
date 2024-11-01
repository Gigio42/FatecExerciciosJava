package listaLivro;

class Imagem {
    private String url;
    private String descricao;

    public Imagem(String url, String descricao) {
        this.url = url;
        this.descricao = descricao;
    }

    // Getters
    public String getUrl() {
        return url;
    }
    public String getDescricao() {
        return descricao;
    }
}

