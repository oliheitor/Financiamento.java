# Projeto de Financiamento Imobiliário

Este projeto em Java simula um sistema de financiamento imobiliário que permite calcular e gerenciar financiamentos para diferentes tipos de imóveis.

## Etapas de Desenvolvimento
Desenvolvido em alguma etapas durante a disciplina de Fundamentos da Programação Orientada a Objetos, esse projeto segue algumas regras para seu desenvolvimento

### **Etapa 1**

- Crie a estrutura do seu projeto contendo as seguintes classes:
  - `Financiamento`
  - `InterfaceUsuario`
  - `Main`
- A classe `Financiamento` terá três atributos: `valorImovel`, `prazoFinanciamento`, e `taxaJurosAnual`.
- A classe `InterfaceUsuario` lida com a entrada de dados do usuário.
- A classe `Main` é a classe principal do programa, onde o fluxo principal é implementado.

### **Etapa 2**

- Reorganize as classes em pacotes: `modelo`, `util`, `main` (para os pacotes foram adotados os nome das classes princpais).
- Ajuste os níveis de acesso e crie getters na classe `Financiamento`.

### **Etapa 3**

- Adicione quatro financiamentos em um `ArrayList` no método `main()`.
- Mostre na tela o valor total de todos os imóveis e o valor total de todos os financiamentos.

### **Etapa 4**

- Crie três subclasses para `Financiamento`: `Casa`, `Apartamento`, e `Terreno`.
- Modifique o `main()` para cadastrar diferentes financiamentos.

### **Etapa 5**

- Converta a classe `Financiamento` para uma classe abstrata.
- Adicione novos atributos específicos a cada uma das subclasses.

### **Etapa 6**

- Na classe `InterfaceUsuario`, modifique os métodos para que tenham tratamento de exceções para lidar com situações como entrada de dados inválidos.

### **Etapa 7**

- Salve em um arquivo de texto os dados de cada financiamento.
- Salve um arquivo contendo os dados serializados dos financiamentos.

## Instruções de Uso

Para utilizar o programa, execute o arquivo Main.java.

## Melhorias Futuras

- Implementar uma interface gráfica para melhorar a experiência do usuário.
- Adicionar mais tipos de imóveis e opções de financiamento.
- Refatorar o código para melhorar a permanencia dos dados em um arquivo de texto.

## Requisitos

- Java 8 ou superior.
- IDE Java (Eclipse, IntelliJ, Visual Studio, etc.).
