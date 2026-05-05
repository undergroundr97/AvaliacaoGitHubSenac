

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

        double numeroSorteado = Math.random()*7;
        int a = (int) numeroSorteado;
        preco[a] -= preco[a] * 0.2 ;

        itens[0] = "1 - Byte Burger Classico R$" + String.format("%.2f", preco[0]);
        itens[1] = "2 - Byte Burger Duplo R$" + String.format("%.2f", preco[1]);
        itens[2] = "3 - Batata Frita P R$" + String.format("%.2f", preco[2]);
        itens[3] = "4 - Batata Frita G R$" + String.format("%.2f", preco[3]);
        itens[4] = "5 - Refrigerante Lata R$" + String.format("%.2f", preco[4]);
        itens[5] = "6 - Suco Normal R$" + String.format("%.2f", preco[5]);
        itens[6] = "7 - Agua R$" + String.format("%.2f", preco[6]);
        //FIM DATABASE



        case 2:
        subMenu();
        while (!scanner.hasNextInt()) {
            System.out.println("Opcao Invalida!");
            scanner.next();
        }
        int opcaoSubmenu = scanner.nextInt();
        scanner.nextLine();
        do {
            switch (opcaoSubmenu){
                case 0:
                    break;
                case 1:
                    System.out.println("Lanches:");
                    System.out.println(itens[0].substring(4));
                    System.out.println(itens[1].substring(4));
                    System.out.println("Digite qualquer tecla para voltar.");
                    String vazio = scanner.nextLine();
                    subMenu();
                    while (!scanner.hasNextInt()) {
                        System.out.println("Opcao Invalida!");
                        scanner.next();
                    }
                    opcaoSubmenu =   scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Acompanhamentos:");
                    System.out.println(itens[2].substring(4));
                    System.out.println(itens[3].substring(4));
                    System.out.println("Digite qualquer tecla para voltar.");
                    vazio = scanner.nextLine();
                    subMenu();
                    while (!scanner.hasNextInt()) {
                        System.out.println("Opcao Invalida!");
                        scanner.next();
                    }
                    opcaoSubmenu = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Bebidas:");
                    System.out.println(itens[4].substring(4));
                    System.out.println(itens[5].substring(4));
                    System.out.println(itens[6].substring(4));
                    System.out.println("Digite qualquer tecla para voltar.");
                    vazio = scanner.nextLine();
                    subMenu();
                    while (!scanner.hasNextInt()) {
                        System.out.println("Opcao Invalida!");
                        scanner.next();
                    }
                    opcaoSubmenu = scanner.nextInt();
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Opção não encontrada!");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Opcao Invalida!");
                        scanner.next();
                    }
                    opcaoSubmenu = scanner.nextInt();
                    scanner.nextLine();
                    break;
            }   } while(opcaoSubmenu != 0);
        exibirMenu();
        opcaoCliente = scanner.nextInt();
        scanner.nextLine();
        break;


    }
    
    public static void subMenu(){
        System.out.println("-------------------");
        System.out.println("1 - Lanches");
        System.out.println("2 - Acompanhmentos");
        System.out.println("3 - Bebidas");
        System.out.println("0 - Voltar");
        System.out.println("Digite opção:");

        System.out.println("O item sorteado " +
                "do dia e:" + itens[a].substring(3) +" com 20% de desconto!");
        exibirMenu();
        while (!scanner.hasNextInt()) {
            System.out.println("Opcao Invalida");
            scanner.next();
        }
        opcaoCliente = scanner.nextInt();
        scanner.nextLine();
    


        ArrayList<Integer> pedidoCliente;
        String nome;
        System.out.println("-----BEMVINDO AO BYTEBURGER-----");
        exibirMenu();
        while (!scanner.hasNextInt()) {
            System.out.println("Opcao Invalida");
            scanner.next();
        }
        int opcaoCliente = scanner.nextInt();
        scanner.nextLine();
        do {
            switch (opcaoCliente) {
                case 0:
                    break;
                case 1:
                    pedidoCliente = new ArrayList<>();
                    valorTotalPedido = 0;
                    String adicionarPedido;
                    System.out.println("Digite o seu nome:" +
                            " ");
                    nome = scanner.nextLine();

                    do {
                        for (String item : itens) {
                            System.out.printf("%s%n", item);
                        }
                        System.out.println("Digite o codigo do produto: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Opcao Invalida");
                            scanner.next();
                        }

                        int opcaoPedidoCliente = scanner.nextInt();
                        while (opcaoPedidoCliente < 1 || opcaoPedidoCliente > 7) {
                            System.out.printf("OPCAO INVALIDA DIGITE NOVAMENTE ");
                            while (!scanner.hasNextInt()) {
                                System.out.println("OpcaoInvalida");
                                scanner.next();
                            }
                            opcaoPedidoCliente = scanner.nextInt();
                        }
                        scanner.nextLine();
                        pedidoCliente.add(opcaoPedidoCliente - 1);
                        System.out.println("Deseja Adicionar um novo produto?");
                        adicionarPedido = scanner.nextLine();
                        while (!adicionarPedido.equalsIgnoreCase("n") && !adicionarPedido.equalsIgnoreCase("s")) {
                            System.out.println("Opcao incorreta, digite novamente (S/N)");
                            adicionarPedido = scanner.nextLine();
                        }
                    } while (!adicionarPedido.equalsIgnoreCase("n"));

                    System.out.println("---- RESUMO PEDIDO ----");
                    System.out.println("Nome: " + nome);
                    for (Integer i : pedidoCliente) {
                        System.out.println(itens[i]);
                        valorTotalPedido += preco[i];
                    }
                    System.out.printf("Valor Total: R$ %.2f%n", valorTotalPedido);
                    LocalDateTime dataAgora = LocalDateTime.now();
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                    System.out.println("Pedido realizado em: " + format.format(dataAgora));
                    System.out.println("------------------------");
                    System.out.println("Confirme com enter");
                    //apenas para verificar pedido
                    String confirmVazio = scanner.nextLine();
                    exibirMenu();
                    while (!scanner.hasNextInt()) {
                        System.out.println("Opcao Invalida");
                        scanner.next();
                    }
                    opcaoCliente = scanner.nextInt();
                    break;
                case 2:


                case 3:

                case 4:

                default:
                    System.out.println("Nao e uma opcao " +
                            "valida!");
                    exibirMenu();
                    while (!scanner.hasNextInt()) {
                        System.out.println("Opcao Invalida");
                        scanner.next();
                    }
                    opcaoCliente = scanner.nextInt();
                    scanner.nextLine();
            }
        } while (opcaoCliente != 0);
        System.out.printf("----- BYE BYE BURGERS -----");

    }

    public static void exibirMenu() {
        System.out.println("1 - Novo Pedido");
        System.out.println("2 - Consultar Cardapio por " +
                "Categoria");
        System.out.println("3 - Calcular Troco");
        System.out.println("4 - Sorteio do Dia");
        System.out.println("0 - Encerrar o Sistema");
    }
}

