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

