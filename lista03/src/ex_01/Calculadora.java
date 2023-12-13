package ex_01;

public class Calculadora {
    public double soma (double num1, double num2){
        return num1 + num2;
    }

    public double subtracao(double num1, double num2){
        return num1 - num2;
    }

    public double divisao(double num1, double num2){
        if(num1 == 0 || num2 == 0) {
            System.out.println("Não é possível dividir por zero");
        }

        return num1 / num2;
    }

    public double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
}
