public class Aluno extends Pessoa implements Identificavel {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String atividade() {
        return "Frequentar aulas e praticar instrumentos.";
    }

    @Override
    public String getId() {
        return matricula;
    }
}