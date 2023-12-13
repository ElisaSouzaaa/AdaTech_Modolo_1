package ex_03;

public class Fatorial {
    public int calculaFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculaFatorial(n - 1);
        }
    }
}
