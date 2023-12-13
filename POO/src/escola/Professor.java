package escola;

public class Professor extends Funcionario{

    private String disciplina;

    public Professor(String nome, int idade, String sexo, double salario, String profissao, String disciplina) {
        super(nome, idade, sexo, salario, profissao);
        this.disciplina = disciplina;
    }

    public void visualizar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Profissão: " + getProfissao());
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("Salario: " + getSalario());
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
