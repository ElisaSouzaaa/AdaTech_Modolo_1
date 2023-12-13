import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Informe 5 números inteiros: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        int[] resultado = somaAcumulada(nums);
        System.out.print("Soma acumulada: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scan.close();
    }

    public static int[] somaAcumulada(int[] nums) {
        int[] resultado = new int[nums.length];
        int soma = 0;
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
            resultado[i] = soma;
        }
        return resultado;
    }
}
