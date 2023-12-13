import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();

        System.out.println("-------------------------------------------------------");
        System.out.println("Escolha a operação que deseja realizar:");
        System.out.println("1 - Somar 2 - Subtrair 3 - Dividir 4 - Multiplicar");
        System.out.println("5 - Resto da divisão 6 - Raiz 7 - Potência");
        System.out.println("-------------------------------------------------------");

        int resposta = scan.nextInt();

        switch (resposta){
            case 1:
                System.out.printf("A soma dos números %.2f e %.2f é: %.2f%n", num1, num2, (num1 + num2));
                break;
            case 2:
                System.out.printf("A subtração dos números %.2f e %.2f é: %.2f%n", num1, num2, (num1 - num2));
                break;
            case 3:
                if(num1 == 0 || num2 == 0) {
                    System.out.print("Não é possível fazer divisão por 0");
                }else {
                    System.out.printf("A divisão dos números %.2f e %.2f é: %.2f%n", num1, num2, (num1 / num2));
                }
                break;
            case 4:
                System.out.printf("A multiplicação dos números %.2f e %.2f é: %.2f%n", num1, num2, (num1 * num2));
                break;
            case 5:
                System.out.printf("O resto da divisão dos números %.2f e %.2f é: %.2f%n", num1, num2, (num1 % num2));
                break;
            case 6:
                double raiz1 = Math.sqrt(num1);
                double raiz2 = Math.sqrt(num2);
                System.out.printf("A raiz do número %.2f é aproximadamente: %.2f%n", num1, raiz1);
                System.out.printf("A raiz do número %.2f é aproximadamente: %.2f%n", num2, raiz2);
                break;
            case 7:
                double pot = Math.pow(num1,num2);
                System.out.printf("A potência do número %.2f e %.2f é: %.2f%n", num1, num2, pot);
                break;
        }

        scan.close();
    }
}
