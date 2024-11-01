package listaLivro;

public class App {
    public static void main(String[] args) {
        Autor asimov = new Autor("Isaac Asimov", "Escritor e bioquímico russo-americano");
        Autor tolkien = new Autor("J.R.R. Tolkien", "Escritor, professor e filólogo britânico");

        Livro fundacao = new Livro("Fundação", 1951, asimov);
        fundacao.adicionarCapitulo("Capítulo 1", "A Psicohistória");
        fundacao.adicionarCapitulo("Capítulo 2", "Os Enciclopedistas");

        Imagem imagemFundacao1 = new Imagem("img1", "Capa da Fundação");
        Imagem imagemFundacao2 = new Imagem("img2", "Planeta Terminus");
        fundacao.adicionarImagem(imagemFundacao1);
        fundacao.adicionarImagem(imagemFundacao2);

        Livro senhorDosAneis = new Livro("O Senhor dos Anéis", 1954, tolkien);
        senhorDosAneis.adicionarCapitulo("Capítulo 1", "Uma festa muito esperada");
        senhorDosAneis.adicionarCapitulo("Capítulo 2", "A sombra do passado");

        Imagem imagemSenhor1 = new Imagem("img3", "Mapa da Terra Média");
        Imagem imagemSenhor2 = new Imagem("img4", "Porto de Valfenda");
        senhorDosAneis.adicionarImagem(imagemSenhor1);
        senhorDosAneis.adicionarImagem(imagemSenhor2);

        System.out.println("Livro: " + fundacao.getTitulo());
        System.out.println("Autor: " + fundacao.getAutor().getNome());
        System.out.println("Ano de Publicação: " + fundacao.getAnoDePublicacao());

        System.out.println("\nCapítulos:");
        for (Capitulo cap : fundacao.getCapitulos()) {
            System.out.println("- " + cap.getTitulo() + ": " + cap.getConteudo());
        }

        System.out.println("\nImagens:");
        for (Imagem img : fundacao.getImagens()) {
            System.out.println("- " + img.getDescricao() + " (" + img.getUrl() + ")");
        }

        System.out.println("\n\nLivro: " + senhorDosAneis.getTitulo());
        System.out.println("Autor: " + senhorDosAneis.getAutor().getNome());
        System.out.println("Ano de Publicação: " + senhorDosAneis.getAnoDePublicacao());

        System.out.println("\nCapítulos:");
        for (Capitulo cap : senhorDosAneis.getCapitulos()) {
            System.out.println("- " + cap.getTitulo() + ": " + cap.getConteudo());
        }

        System.out.println("\nImagens:");
        for (Imagem img : senhorDosAneis.getImagens()) {
            System.out.println("- " + img.getDescricao() + " (" + img.getUrl() + ")");
        }
    }
}
