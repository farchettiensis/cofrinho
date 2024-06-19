package model;
import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void listarMoedas() {
        for (Moeda moeda : moedas) {
            moeda.info();
        }
    }

    public double calcularTotalEmReais() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            total += moeda.converter();
        }
        return total;
    }
}
