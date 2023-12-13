package escola;

public class Aluno extends Pessoa{
    private int serie;
    private boolean matricula;

    public Aluno(String nome, int idade, String sexo, int serie, boolean matricula) {
        super(nome, idade, sexo);
        this.serie = serie;
        this.matricula = matricula;
    }

    public void visualizar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Série: " + getSerie());
        System.out.println("Matrículado: " + isMatricula());
    }

    @Override
    public void menu() {
        System.out.println("Bem-vinde a nossa escola!");
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

}
