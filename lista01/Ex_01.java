package com.lista01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade:");
        double idade = scan.nextDouble();

        System.out.println("Digite sua profissão:");
        scan.nextLine();
        String profissao = scan.nextLine();

        System.out.println("Seu nome é " + nome);
        System.out.print("Sua profissão é " + profissao);
        System.out.printf("%nE sua idade é " + idade);

        scan.close();

    }
}
