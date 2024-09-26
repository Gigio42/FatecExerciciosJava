package aula08;

public class LivroDidatico extends Livro {

    private String disciplina;

    public LivroDidatico(int isbn, String titulo, String disciplina) {
        super(isbn, titulo);
        setDisciplina(disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
