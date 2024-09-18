import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("Paul George", 32, "A12345"));
        pessoas.add(new Professor("Kawhi Leonard", 30, "A67890"));
        pessoas.add(new Funcionario("James Harden", 34, "B12345"));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Atividade: " + pessoa.atividade());
            System.out.println("ID: " + ((Identificavel) pessoa).getId());
            System.out.println();
        }
    }
}