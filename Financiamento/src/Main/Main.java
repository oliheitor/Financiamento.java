// Main.java
package Main;

import java.util.ArrayList;
import Financiamento.Apartamento;
import Financiamento.Casa;
import Financiamento.Financiamento;
import Financiamento.Terreno;
import InterfaceUsuario.InterfaceUsuario;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        // ArrayList que armazena os financiamentos
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Adicionando dois financiamentos de Casa (pelo teclado e diretamente) Na ArrayList
        // Casa 1 - Preenchendo pelo teclado
        double valorFinanciamentoCasa1 = interfaceUsuario.pedirValorFinanciamento();
        int prazoFinanciamentoCasa1 = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnualCasa1 = interfaceUsuario.pedirTaxaJuros();
        double areaConstruidaCasa1 = interfaceUsuario.pedirAreaConstruida();
        double tamanhoTerrenoCasa1 = interfaceUsuario.pedirTamanhoTerreno();
        Casa casa1 = new Casa(valorFinanciamentoCasa1, prazoFinanciamentoCasa1, taxaJurosAnualCasa1, areaConstruidaCasa1, tamanhoTerrenoCasa1);
        financiamentos.add(casa1);

        // Casa 2
        double valorFinanciamentoCasa2 = 350000;
        int prazoFinanciamentoCasa2 = 5;
        double taxaJurosAnualCasa2 = 0.2;
        double areaConstruidaCasa2 = 150;
        double tamanhoTerrenoCasa2 = 320;
        Casa casa2 = new Casa(valorFinanciamentoCasa2, prazoFinanciamentoCasa2, taxaJurosAnualCasa2, areaConstruidaCasa2, tamanhoTerrenoCasa2);
        financiamentos.add(casa2);

        // Adicionando dois Financiamentos de Apartamento na ArrayLit
        // Apartamento 1
        double valorFinanciamentoApt1 = 300000;
        int prazoFinanciamentoApt1 = 20;
        double taxaJurosAnualApt1 = 0.05;
        int numeroVagasGaragemApt1 = 1;
        int numeroAndarApt1 = 5;
        Apartamento apt1 = new Apartamento(valorFinanciamentoApt1, prazoFinanciamentoApt1, taxaJurosAnualApt1, numeroVagasGaragemApt1, numeroAndarApt1);
        financiamentos.add(apt1);

        // Apartamento 2
        double valorFinanciamentoApt2 = 300000;
        int prazoFinanciamentoApt2 = 20;
        double taxaJurosAnualApt2 = 0.05;
        int numeroVagasGaragemApt2 = 2;
        int numeroAndarApt2 = 20;
        Apartamento apt2 = new Apartamento(valorFinanciamentoApt2, prazoFinanciamentoApt2, taxaJurosAnualApt2, numeroVagasGaragemApt2, numeroAndarApt2);
        financiamentos.add(apt2);

        // Adicionando um financiamento de Terreno na ArrayList
        double valorFinanciamentoTerreno = 200000;
        int prazoFinanciamentoTerreno = 15;
        double taxaJurosAnualTerreno = 0.07;
        String tipoZonaTerreno = "comercial";
        Terreno terreno = new Terreno(valorFinanciamentoTerreno, prazoFinanciamentoTerreno, taxaJurosAnualTerreno, tipoZonaTerreno);
        financiamentos.add(terreno);

        // Cálculo do valor total de todos os imóveis e financiamentos
        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento financiamento : financiamentos) {
            totalImoveis += financiamento.getValorFinanciamento();
            totalFinanciamentos += financiamento.calcularTotalDoPagamento();
        }

        // Resultados
        for (int i = 0; i < financiamentos.size(); i++) {
            Financiamento financiamento = financiamentos.get(i);
            System.out.println("Financiamento " + (i + 1) +
                    " - Valor do financiamento: R$ " + financiamento.getValorFinanciamento() +
                    ", Valor total do financiamento: R$ " + financiamento.calcularTotalDoPagamento());
        }

        System.out.println("Total de todos os imóveis: R$ " + totalImoveis);
        System.out.println("Total de todos os financiamentos: R$ " + totalFinanciamentos);

        try {
            // Salvar dados
            interfaceUsuario.salvarFinanciamentos(financiamentos, "dados_financiamentos");

            // Ler dados
            ArrayList<Financiamento> financiamentosLidos = interfaceUsuario.lerFinanciamentos("dados_financiamentos");

            // Faça algo com os dados lidos se necessário
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); // Ou trate a exceção de acordo com a sua lógica
        }
    }
}