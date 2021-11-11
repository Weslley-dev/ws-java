package util;

public class currencyConverter {

    public static double imposto = 0.06;

    public double conversao(double valor, double cotacao){
        double a = valor * imposto;
        return (valor - a) * cotacao;

        }
}


