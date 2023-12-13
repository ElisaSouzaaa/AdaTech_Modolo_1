package ex_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calcular calcular = new Calcular();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.println("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double litrosNecessarios = calcular.calcularLitrosCombustivel(tempo, velocidadeMedia);
        System.out.printf("Litros necessários: %.3f", litrosNecessarios);

        scanner.close();
    }
}
