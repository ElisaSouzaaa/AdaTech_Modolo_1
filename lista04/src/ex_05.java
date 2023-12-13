import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][] matrizInteiros = new int[3][3];

        for(int i = 0; i < matrizInteiros.length; i++){
            for(int j = 0; j < matrizInteiros[i].length; j++) {
                System.out.println("Digite o valor para a linha [" + i + "] e a coluna [" + j + "]: ");
                matrizInteiros[i][j] = scan.nextInt();
            }
        }

        System.out.println("O índice do pivô é " + calculoPivo(matrizInteiros));

    }
    public static int calculoPivo(int[][] nums){
        for(int j = 0; j < nums[0].length; j++){
            int somaSuperior = 0;
            int somaInferior = 0;
            for(int k = 0; k < j; k++){
                somaSuperior += nums[0][k];
                somaInferior += nums[2][k];
            }
            if(somaSuperior == somaInferior && nums[0][j] == nums[2][j]){
                return j;
            }
        }

        return -1;
    }
}
