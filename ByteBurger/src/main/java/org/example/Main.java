package org.example;

<<<<<<< HEAD
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

=======

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // DATABASE
        String[] itens = new String[7];
        double[] preco = new double[7];
        preco[0] = 22.90;
        preco[1] = 29.90;
        preco[2] = 12.00;
        preco[3] = 18.00;
        preco[4] = 7.00;
        preco[5] = 10.00;
        preco[6] = 4.00;

        itens[0] = "1 - Byte Burger Classico R$" + String.format("%.2f", preco[0]);
        itens[1] = "2 - Byte Burger Duplo R$" + String.format("%.2f", preco[1]);
        itens[2] = "3 - Batata Frita P R$" + String.format("%.2f", preco[2]);
        itens[3] = "4 - Batata Frita G R$" + String.format("%.2f", preco[3]);
        itens[4] = "5 - Refrigerante Lata R$" + String.format("%.2f", preco[4]);
        itens[5] = "6 - Suco Normal R$" + String.format("%.2f", preco[5]);
        itens[6] = "7 - Agua R$" + String.format("%.2f", preco[6]);
        //FIM DATABASE

>>>>>>> 0c2756757d2568388c8b9e7d634096168b68022d
    }
}
