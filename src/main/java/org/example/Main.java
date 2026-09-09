package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        1. Criar uma estrutura condicional, para saber o valor unitário com base no código fornecido
        2. Calcular o valor total da NF.
        3. Criar uma estrutura condicional para determinar o valor do desconto com base no valor total da compra.
        4. Calcular o preço final
        5. Imprimir os resultados.
         */
        Scanner entrada = new Scanner(System.in);
        int codigoProduto;
        int quantidadeProduto;
        double valorUnitario;
        double valorTotalNF;
        double desconto = 0; // Toda variável deve ser inicializada antes da utilização.
        double valorTotalComDesconto;
        double valorDoDesconto;
        System.out.println("Programa emissor de NF");
        System.out.print("Informe o código do produto: ");
        codigoProduto = entrada.nextInt();

        System.out.print("Informe a quantidade do produto: ");
        quantidadeProduto = entrada.nextInt();

        // Estrutura condicional que determina o valor unitário.
        if (codigoProduto >= 1 && codigoProduto <= 10) {
            valorUnitario = 10;
        } else if (codigoProduto > 10 && codigoProduto <= 20) {
            valorUnitario = 15;
        } else if (codigoProduto > 20 && codigoProduto <= 30) {
            valorUnitario = 20;
        } else if (codigoProduto > 30 && codigoProduto <= 40) {
            valorUnitario = 30;
        } else { // Este else impede a execução do código sem que o valor unitário seja inicializado.
            System.out.println("O valor fornecido é inválido, o programa será encerrado.");
            System.out.println("Por favor, insira valores entre 1 e 40.");
            return;
        }

        valorTotalNF = valorUnitario * quantidadeProduto;

        if (valorTotalNF < 250)
            desconto = .05;
        else if (valorTotalNF > 250 && valorTotalNF < 500)
            desconto = .1;
        else if (valorTotalNF > 500)
            desconto = .15;

        valorDoDesconto = (valorTotalNF * desconto);
        valorTotalComDesconto = valorTotalNF - valorDoDesconto;

        System.out.println();
        System.out.println(".:|NF Una|:.");
        System.out.printf("\tValor unitário R$ %.2f\n",
                valorUnitario);
        System.out.printf("\tQuantidade de produtos: R$ %d\n",
                quantidadeProduto);
        System.out.printf("\tValor total da NF sem desconto R$ %.2f\n",
                valorTotalNF);
        System.out.printf("\tValor do desconto concedido: R$ %.2f\n",
                valorDoDesconto);
        System.out.printf("\tValor final da NF (já com desconto): R$ %.2f\n",
                valorTotalComDesconto);
        System.out.println();
        System.out.println("Até mais!! \uD83D\uDE01 ❤️");

    }
}