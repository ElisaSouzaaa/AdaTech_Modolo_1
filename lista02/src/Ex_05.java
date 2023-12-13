import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        int fatorial = 1;
        for(int i = 1; i <= num; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);

        scan.close();
    }
}
