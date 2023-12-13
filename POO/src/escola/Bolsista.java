package escola;

public class Bolsista extends Aluno{
    private boolean bolsista;

    public Bolsista(String nome, int idade, String sexo, int serie, boolean matricula, boolean bolsista) {
        super(nome, idade, sexo, serie, matricula);
        this.bolsista = bolsista;
    }

    public void visualizar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Série: " + getSerie());
        System.out.println("Matrículado: " + isMatricula());
        System.out.println("Bolsista: " + isBolsista());
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }
}
