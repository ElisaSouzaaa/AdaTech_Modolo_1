package ex_05;

public class Calcular {
    public double calcularLitrosCombustivel(double tempo, double velocidadeMedia) {
        double distancia = tempo * velocidadeMedia; // Calcula a distância percorrida (distância = tempo * velocidade)
        double litrosNecessarios = distancia / 12.0; // Calcula a quantidade de litros necessários (litros = distância / consumo)
        return litrosNecessarios;
    }
}
