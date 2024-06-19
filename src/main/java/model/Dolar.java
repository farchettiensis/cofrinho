package model;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor, "Dólar");
    }

    @Override
    public void info() {
        System.out.println("Dólar: " + valor);
    }

    @Override
    public double converter() {
        return valor * 5.0;
    }
}
