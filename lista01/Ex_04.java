package com.lista01;

public class Ex_04 {
    public static void main(String[] args) {
        double L1 = 10;
        double L2 = 20;
        double areaRetangulo = L1 * L2;
        System.out.printf("A área do retângulo é %.2f%n", areaRetangulo);

        double b1 = 10;
        double h = 20;
        double areaTriangulo = (b1 * h) / 2;
        System.out.printf("A área do triângulo é %.2f%n", areaTriangulo);

        double r = 20;
        double areaCirculo = Math.PI * Math.pow(r,2);
        System.out.printf("A área do círculo é %.2f%n", areaCirculo);

        double b = 20;
        double B = 10;
        double H = 10;
        double areaTrapezio = (( b + B ) * h ) / 2;
        System.out.printf("A área do trapézio é %.2f%n", areaTrapezio);
    }
}
