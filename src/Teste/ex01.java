import java.util.ArrayList;
import java.util.List;

class Estudante {
    private String nome;
    private String matricula;
    private List<Disciplina> disciplinas;
    private EquipeFutebol equipeFutebol;

    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    public void cursarDisciplina(Disciplina disciplina) {
        if (disciplinas.size() < 8) {
            disciplinas.add(disciplina);
            disciplina.adicionarEstudante(this);
        } else {
            System.out.println("O estudante já está cursando o número máximo de disciplinas.");
        }
    }

    public void ingressarEquipe(EquipeFutebol equipe) {
        this.equipeFutebol = equipe;
        equipe.adicionarJogador(this);
    }
}

class Disciplina {
    private String nomeDisciplina;
    private String codigo;
    private List<Estudante> estudantes;

    public Disciplina(String nomeDisciplina, String codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void removerEstudante(Estudante estudante) {
        estudantes.remove(estudante);
    }
}

class EquipeFutebol {
    private String nomeEquipe;
    private String treinador;
    private List<Estudante> jogadores;

    public EquipeFutebol(String nomeEquipe, String treinador) {
        this.nomeEquipe = nomeEquipe;
        this.treinador = treinador;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Estudante estudante) {
        jogadores.add(estudante);
    }

    public void removerJogador(Estudante estudante) {
        jogadores.remove(estudante);
    }
}
