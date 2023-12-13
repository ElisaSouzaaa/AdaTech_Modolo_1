package ex_02;

public class ConverterTemperatura {
    public double celsiusFahrenheit(double temperatura){
        double F = (temperatura * 9/5 ) + 32;
        return F;
    }

    public double celsiusKelvin(double  temperatura){
        double K = temperatura + 273.15;
        return K;
    }

    public double fahrenheitKelvin(double temperatura){
        double K = (temperatura + 459.67) * 5/9;
        return K;
    }

    public  double fahrenheitCelsius(double temperatura){
        double C = (temperatura - 32) * 5/9;
        return C;
    }

    public double kelvinFahrenheit(double temperatura) {
        double F = ((temperatura - 273.15) * 9/5 ) + 32;
        return F;
    }

    public double kelvinCelsius(double temperatura) {
        double C = temperatura - 273.15;
        return C;
    }

}
