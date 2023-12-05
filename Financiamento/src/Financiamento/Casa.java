// Casa.java
package Financiamento;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorFinanciamento, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double tamanhoTerreno) {
        super(valorFinanciamento, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
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
