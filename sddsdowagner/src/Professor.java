public class Professor extends Pessoa implements Identificavel {
    private String registroFuncional;

    public Professor(String nome, int idade, String registroFuncional) {
        super(nome, idade);
        this.registroFuncional = registroFuncional;
    }

    @Override
    public String atividade() {
        return "Ministrar aulas de música.";
    }

    @Override
    public String getId() {
        return registroFuncional;
    }
}