package com.lista01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o seu peso em kg:");
        double peso = scan.nextDouble();

        System.out.println("Insira a sua altura em metros:");
        double altura = scan.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f%n", IMC);

        scan.close();
    }
}
