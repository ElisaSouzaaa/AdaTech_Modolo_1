package com.lista01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite seu salário:");
        double salario = scan.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();

        System.out.println("Digite seu sexo:");
        scan.nextLine();
        String sexo = scan.nextLine();

        System.out.printf("%nSeu nome é: %s%nSeu salário é de: %.2f%nSua altura é de: %.2f%nSeu sexo é: %s%n", nome, salario, altura, sexo);

        scan.close();
    }
}
