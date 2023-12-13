package ex_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de horas trabalhadas por mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        double salarioAnual = funcionario.calcularSalarioAnual(nome, horasTrabalhadas, valorHora);
        System.out.printf("%s ganha R$ %.2f por ano.", nome, salarioAnual);

        scanner.close();
    }
}
