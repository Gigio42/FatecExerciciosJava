package listaLivro;

class Autor {
    private String nome;
    private String biografia;

    public Autor(String nome, String biografia) {
        this.nome = nome;
        this.biografia = biografia;
    }

    public String getNome() {
        return nome;
    }
    public String getBiografia() {
        return biografia;
    }
}
