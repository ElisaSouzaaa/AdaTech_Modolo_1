import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] turma = new int[4][4];

        for (int i = 0; i < turma.length; i++) {
            System.out.println("Informe as 4 notas do " + (i+1) + " aluno:");
            for (int j = 0; j < turma[i].length; j++) {
                turma[i][j] = scan.nextInt();
            }
        }

        calcularMedias(turma);

        scan.close();
    }

    public static void calcularMedias(int[][] turma) {
        double[] mediasAlunos = new double[turma.length];
        double mediaTurma = 0;

        for (int i = 0; i < turma.length; i++) {
            double soma = 0;
            for (int j = 0; j < turma[i].length; j++) {
                soma += turma[i][j];
            }
            mediasAlunos[i] = soma / turma[i].length;
            System.out.println("Média do aluno " + (i+1) + ": " + mediasAlunos[i]);
            mediaTurma += mediasAlunos[i];
        }

        mediaTurma = mediaTurma / turma.length;
        System.out.println("Média da turma: " + mediaTurma);
    }
}

