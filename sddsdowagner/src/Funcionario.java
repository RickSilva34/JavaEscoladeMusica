public class Funcionario extends Pessoa implements Identificavel {
    private String numeroCracha;

    public Funcionario(String nome, int idade, String numeroCracha) {
        super(nome, idade);
        this.numeroCracha = numeroCracha;
    }

    @Override
    public String atividade() {
        return "Realizar tarefas administrativas.";
    }

    @Override
    public String getId() {
        return numeroCracha;
    }
}