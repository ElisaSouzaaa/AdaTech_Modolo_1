package escola;

public class Funcionario extends Pessoa {

    private double salario;
    private String profissao;

    public Funcionario(String nome, int idade, String sexo, double salario, String profissao) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.profissao = profissao;
    }

    @Override
    public void menu() {
        System.out.println("Bem-vinde a nossa escola!");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
