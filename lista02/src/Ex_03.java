import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas deseja registrar?");
        int resposta = scan.nextInt();

        double soma = 0;
        for(int i = 1; i <= resposta; i++) {
            System.out.println("Digite a " + i + " nota:");
            double nota = scan.nextDouble();
            soma += nota;
        }

        double media = soma / resposta;
        System.out.println("A média das notas é de: " + media);

        scan.close();
    }
}
