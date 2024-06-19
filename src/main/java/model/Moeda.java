package model;

public abstract class Moeda {
    protected double valor;
    protected String nome;

    public Moeda(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public abstract void info();
    public abstract double converter();
}
