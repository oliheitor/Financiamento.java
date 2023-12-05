// InterfaceUsuario.java
package InterfaceUsuario;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

import Financiamento.Financiamento;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

    // Métodos
    // Entrada dos dados do Financiamento
    public double pedirValorFinanciamento() {
        double valor;
        do {
            System.out.print("Digite o valor que deseja financiar: ");
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("---VALOR INVÁLIDO---");
                System.out.println("O valor do financiamento deve ser positivo. Tente novamente.");
            }
        } while (valor <= 0);
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Digite o prazo do financiamento em anos: ");
                prazo = scanner.nextInt();
                if (prazo <= 0) {
                    System.out.println("---VALOR INVÁLIDO---");
                    System.out.println("O prazo do financiamento deve ser positivo e de no mínimo 1 ano. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("---ENTRADA INVÁLIDA---");
                System.out.println("Digite um valor inteiro. Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
            }
        } while (!entradaValida);
        return prazo;
    }

    public double pedirTaxaJuros() {
        double taxa = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Digite a taxa de juros anual: ");
                taxa = scanner.nextDouble();
                if (taxa <= 0 || taxa > 5) {
                    System.out.println("---VALOR INVÁLIDO---");
                    System.out.println("A taxa de juros deve ser positiva e não pode ser tão alta. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("---ENTRADA INVÁLIDA---");
                System.out.println("Digite um valor numérico. Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
            }
        } while (!entradaValida);
        return taxa;
    }

    public double pedirAreaConstruida() {
        double area = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Digite o tamanho da área construída: ");
                area = scanner.nextDouble();
                if (area <= 0) {
                    System.out.println("---VALOR INVÁLIDO---");
                    System.out.println("A área construída deve ser positiva. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("---ENTRADA INVÁLIDA---");
                System.out.println("Digite um valor numérico. Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
            }
        } while (!entradaValida);
        return area;
    }

    public double pedirTamanhoTerreno() {
        double tamanho = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Digite o tamanho do terreno: ");
                tamanho = scanner.nextDouble();
                if (tamanho <= 0) {
                    System.out.println("---VALOR INVÁLIDO---");
                    System.out.println("O tamanho do terreno deve ser positivo. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("---ENTRADA INVÁLIDA---");
                System.out.println("Digite um valor numérico. Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
            }
        } while (!entradaValida);
        return tamanho;
    }

    public int pedirNumeroVagasGaragem() {
        int numeroVagas = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Digite o número de vagas na garagem: ");
                numeroVagas = scanner.nextInt();
                if (numeroVagas < 0) {
                    System.out.println("---VALOR INVÁLIDO---");
                    System.out.println("O número de vagas na garagem deve ser não negativo. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("---ENTRADA INVÁLIDA---");
                System.out.println("Digite um valor inteiro. Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
            }
        } while (!entradaValida);
        return numeroVagas;
    }

    public int pedirNumeroAndar() {
        int numeroAndar = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Digite o número do andar: ");
                numeroAndar = scanner.nextInt();
                if (numeroAndar < 0) {
                    System.out.println("---VALOR INVÁLIDO---");
                    System.out.println("O número do andar deve ser não negativo. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("---ENTRADA INVÁLIDA---");
                System.out.println("Digite um valor inteiro. Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
            }
        } while (!entradaValida);
        return numeroAndar;
    }

    public String pedirTipoZona() {
        System.out.print("Digite o tipo de zona (exemplo: residencial ou comercial): ");
        return scanner.next();
    }

   // Métodos de salvamento e leitura de dados
    public void salvarFinanciamentos(ArrayList<Financiamento> financiamentos, String nomeArquivo) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            objectOutputStream.writeObject(financiamentos);
        }
    }

    public ArrayList<Financiamento> lerFinanciamentos(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            return (ArrayList<Financiamento>) objectInputStream.readObject();
        }
    }
}
