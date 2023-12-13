package ex_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 = scan.nextDouble();

        System.out.println("----------------------------------------------------------");
        System.out.println("         Escolha a operação que deseja realizar:");
        System.out.println("1 - soma | 2 - subtração | 3 - multiplicação | 4 - divisão");
        System.out.println("----------------------------------------------------------");
        int resposta = scan.nextInt();

        if(resposta == 1) {
            System.out.printf("O resultado da soma é %.2f%n", calculadora.soma(num1, num2));
        } else if (resposta == 2) {
            System.out.printf("O resultado da subtração é %.2f%n", calculadora.subtracao(num1,num2));
        }else if (resposta == 3){
            System.out.printf("O resultado da multiplicação é %,2f%n", calculadora.multiplicacao(num1,num2));
        } else if (resposta == 4) {
            System.out.printf("O resultado da divisão é %.2f%n", calculadora.divisao(num1,num2));
        }else {
            System.out.print("Opção inválida");
        }
        scan.close();
    }
}