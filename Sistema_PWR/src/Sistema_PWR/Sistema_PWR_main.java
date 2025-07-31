package Sistema_PWR;

import java.util.Scanner;

public class Sistema_PWR_main {
    public static void main(String[] args) {
        Sistema_PWR sistema = new Sistema_PWR();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n====== MENU FILMES ======\n" +
            					"1 - Adicionar restaurante\n" +
            					"2 - Adicionar cliente\n" +
            					"3 - Registrar visita a restaurante\n" +
            					"4 - Votar em prato preferido\n" +
            					"5 - Listar clientes de um restaurante\n" +
            					"6 - Mostrar melhor prato\n" +
            					"0 - Sair\n" +
            					"Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Nome do restaurante: ");
                    String nomeR = sc.nextLine();
                    System.out.print("Prato principal: ");
                    String prato = sc.nextLine();
                    sistema.adicionarRestaurante(nomeR, prato);
                    System.out.println("Restaurante adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do cliente: ");
                    String nomeC = sc.nextLine();
                    System.out.print("Email do cliente: ");
                    String email = sc.nextLine();
                    sistema.adicionarCliente(nomeC, email);
                    System.out.println("Cliente adicionado com sucesso!");
                    break;

                case 3:
                    System.out.print("Email do cliente: ");
                    String emailVisita = sc.nextLine();
                    System.out.print("Nome do restaurante: ");
                    String nomeVisita = sc.nextLine();
                    sistema.visitarRestaurante(emailVisita, nomeVisita);
                    System.out.println("Visita registrada.");
                    break;

                case 4:
                    System.out.print("Email do cliente: ");
                    String emailVoto = sc.nextLine();
                    System.out.print("Nome do restaurante: ");
                    String nomeVoto = sc.nextLine();
                    System.out.println(sistema.votarPratoPreferido(emailVoto, nomeVoto));
                    break;

                case 5:
                    System.out.print("Nome do restaurante: ");
                    String nomeListar = sc.nextLine();
                    System.out.println("Clientes que visitaram " + nomeListar + ":");
                    for (Clientes c : sistema.listarClientesRestaurante(nomeListar)) {
                        System.out.println("- " + c.getNomeCliente() + " (" + c.getEmail() + ")");
                    }
                    break;

                case 6:
                    System.out.println(sistema.melhorPrato());
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...\n"+
                    					"Obrigado por usar o Sistema_PWR!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}

