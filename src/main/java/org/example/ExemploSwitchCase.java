package org.example;

import java.util.Scanner;

public class ExemploSwitchCase {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo;

        System.out.println("Informe um código");
        codigo = entrada.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("O número informado " +
                        "é diferente do esperado...");
                break;
        }

        switch (codigo) {
            case 1 -> {
                System.out.println("Um");
            }

            case 2 -> {
                System.out.println("Dois");
            }

            case 3 -> {
                System.out.println("Três");
            }

            default -> {
                System.out.println("Quatro");
            }
        }

    }
}
