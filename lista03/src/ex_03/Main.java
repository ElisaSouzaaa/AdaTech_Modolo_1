package ex_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro ");
        int num = scan.nextInt();

        System.out.println("\nO fatorial de " + num + " é " + fatorial.calculaFatorial(num));

        scan.close();
    }
}