package org.example;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        double valorRecebido;
        double valorTotalPedido = 0;

        System.out.println("Digite o valor possuido:");
        valorRecebido = sc.nextDouble();

        while(valorRecebido < valorTotalPedido){
            System.out.println("Valor " +
                    "Insuficiente");
            System.out.println("Adicioe mais " +
                    "fundos");

            System.out.println("Valor total do pedido: " + valorTotalPedido);
            valorRecebido += sc.nextDouble();
        }
        double troco = valorRecebido - valorTotalPedido;
        System.out.println("Troco e: " + troco);

        }

    }
}
