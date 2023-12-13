package escola;
public class Atendente extends  Funcionario{

    private String areaAtendimento;

    public Atendente(String nome, int idade, String sexo, double salario, String profissao, String areaAtendimento) {
        super(nome, idade, sexo, salario, profissao);
        this.areaAtendimento = areaAtendimento;
    }

    public void visualizar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Profissao: " + getProfissao());
        System.out.println("Área de atendimento: " + getAreaAtendimento());
        System.out.println("Salario: " + getSalario());
    }

    public String getAreaAtendimento() {
        return areaAtendimento;
    }

    public void setAreaAtendimento(String areaAtendimento) {
        this.areaAtendimento = areaAtendimento;
    }
}
