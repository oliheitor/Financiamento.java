// Financiamento.java
package Financiamento;

import java.io.Serializable;

public abstract class Financiamento implements Serializable {
    // Definição dos atributos comuns
    private double valorFinanciamento;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Método construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorFinanciamento = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Getters para os atributos comuns
    public double getValorFinanciamento() {
        return valorFinanciamento;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Novo método toString para facilitar a gravação em arquivo de texto
    @Override
    public String toString() {
        return String.format("%.2f;%d;%.2f;", valorFinanciamento, prazoFinanciamento, taxaJurosAnual);
    }

    // Métodos abstratos a serem implementados pelas subclasses
    public abstract double calcularPagamentoMensal();

    public abstract double calcularTotalDoPagamento();
}
