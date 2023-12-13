package ex_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConverterTemperatura conversor = new ConverterTemperatura();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vinde ao conversor de temperatura! Digite a temperatura atual: ");
        double temperaturaAtual = scan.nextDouble();

        System.out.println("-------------------------------------------");
        System.out.println("Em qual categoria essa temperado pertence?");
        System.out.println("1 - Celsius | 2 - Fahrenheit | 3 - Kelvin");
        System.out.println("-------------------------------------------");

        int resposta = scan.nextInt();

        if(resposta == 1) {
            System.out.println("Para qual categoria deseja converter?\n1 - Fahrenheit | 2 - Kelvin");
            resposta = scan.nextInt();

            if(resposta == 1) {
                System.out.printf("A temperatura convertida para Fahrenheit é %.2f", conversor.celsiusFahrenheit(temperaturaAtual));
            } else if (resposta == 2) {
                System.out.printf("A temperatura convertida para Kelvin é %.2f", conversor.celsiusKelvin(temperaturaAtual));
            }else {
                System.out.print("Resposta inválida");
            }
        } else if (resposta == 2) {
            System.out.println("Para qual categoria deseja converter?\n1 - Celsius | 2 - Kelvin");
            resposta = scan.nextInt();

            if(resposta == 1) {
                System.out.printf("A temperatura convertida para Celsius é %.2f", conversor.fahrenheitCelsius(temperaturaAtual));
            } else if (resposta == 2) {
                System.out.printf("A temperatura convertida para Kelvin é %.2f", conversor.fahrenheitKelvin(temperaturaAtual));
            }else {
                System.out.print("Resposta inválida");
            }
        } else if (resposta == 3) {
            System.out.println("Para qual categoria deseja converter?\n1 - Celsius | 2 - Fahrenheit");
            resposta = scan.nextInt();

            if(resposta == 1) {
                System.out.printf("A temperatura convertida para Celsius é %.2f", conversor.kelvinCelsius(temperaturaAtual));
            } else if (resposta == 2) {
                System.out.printf("A temperatura convertida para Fahrenheit é %.2f", conversor.kelvinFahrenheit(temperaturaAtual));
            }else {
                System.out.print("Resposta inválida");
            }
        }else {
            System.out.print("Resposta inválida");
        }
        scan.close();
    }
}
