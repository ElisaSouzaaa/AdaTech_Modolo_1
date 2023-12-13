import java.util.Arrays;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite 5 números para a array A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }

        System.out.println("Digite 5 números para a array B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = scan.nextInt();
        }

        int[] resultado = resultadoArray(A, B);
        System.out.println("A concatenação dos números digitados é: " + Arrays.toString(resultado));

        scan.close();
    }

    public static int[] resultadoArray(int[] A, int[] B) {
        int[] resultado = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            resultado[k++] = A[i++];
            resultado[k++] = B[j++];
        }

        while (i < A.length) {
            resultado[k++] = A[i++];
        }

        while (j < B.length) {
            resultado[k++] = B[j++];
        }

        return resultado;
    }

}