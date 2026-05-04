package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
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
