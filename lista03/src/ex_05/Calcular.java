package ex_05;

public class Calcular {
    public double calcularLitrosCombustivel(double tempo, double velocidadeMedia) {
        double distancia = tempo * velocidadeMedia;
        double litrosNecessarios = distancia / 12.0;
        return litrosNecessarios;
    }
}
