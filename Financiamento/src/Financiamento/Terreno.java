// Terreno.java
package Financiamento;

public class Terreno extends Financiamento {
    // Atributos específicos para Terreno
    private String tipoZona;

    // Método construtor
    public Terreno(double valorFinanciamento, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorFinanciamento, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = getTaxaJurosAnual() / 12;
        int meses = getPrazoFinanciamento() * 12;
        return getValorFinanciamento() * taxaMensal * Math.pow((1 + taxaMensal), meses) / (Math.pow((1 + taxaMensal), meses) - 1);
    }

    @Override
    public double calcularTotalDoPagamento() {
        return calcularPagamentoMensal() * getPrazoFinanciamento() * 1.02; // Acréscimo de 2% sobre o valor com juros
    }
}
