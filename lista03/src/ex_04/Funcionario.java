package ex_04;

public class Funcionario {
    public double calcularSalarioAnual(String nome, int horasTrabalhadas, double valorHora) {
        double salarioMensal = horasTrabalhadas * valorHora;
        double salarioAnual = salarioMensal * 12;
        return salarioAnual;
    }
}
