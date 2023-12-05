// Apartamento.java
package Financiamento;

public class Apartamento extends Financiamento {
    // Atributos específicos para Apartamento
    private int numeroVagasGaragem;
    private int numeroAndar;

    // Método construtor
    public Apartamento(double valorFinanciamento, int prazoFinanciamento, double taxaJurosAnual, int numeroVagasGaragem, int numeroAndar) {
        super(valorFinanciamento, prazoFinanciamento, taxaJurosAnual);
        this.numeroVagasGaragem = numeroVagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = getTaxaJurosAnual() / 12;
        int meses = getPrazoFinanciamento() * 12;
        return getValorFinanciamento() * taxaMensal * Math.pow((1 + taxaMensal), meses) / (Math.pow((1 + taxaMensal), meses) - 1);
    }

    @Override
    public double calcularTotalDoPagamento() {
        return calcularPagamentoMensal() * getPrazoFinanciamento();
    }
}
