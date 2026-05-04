package org.example;


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

        System.out.println("O item sorteado " +
                "do dia e:" + itens[a].substring(3) +" com 20% de desconto!");
        exibirMenu();
        while (!scanner.hasNextInt()) {
            System.out.println("Opcao Invalida");
            scanner.next();
        }
        opcaoCliente = scanner.nextInt();
        scanner.nextLine();
        break;





    }
}
