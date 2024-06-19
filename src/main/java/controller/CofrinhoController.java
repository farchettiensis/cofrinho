package controller;
import model.Dolar;
import model.Real;
import model.Euro;
import model.Cofrinho;

public class CofrinhoController {
    private Cofrinho cofrinho;

    public CofrinhoController(Cofrinho cofrinho) {
        this.cofrinho = cofrinho;
    }

    public void adicionarDolar(double valor) {
        cofrinho.adicionarMoeda(new Dolar(valor));
    }

    public void adicionarEuro(double valor) {
        cofrinho.adicionarMoeda(new Euro(valor));
    }

    public void adicionarReal(double valor) {
        cofrinho.adicionarMoeda(new Real(valor));
    }

    public void listarMoedas() {
        cofrinho.listarMoedas();
    }

    public double calcularTotalEmReais() {
        return cofrinho.calcularTotalEmReais();
    }
}
