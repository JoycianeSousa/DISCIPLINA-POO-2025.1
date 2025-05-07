package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] voos = {101, 102, 103};
        int[] lugares = {5, 0, 2};
        String[] origens = {"São Paulo", "Rio", "Salvador"};
        String[] destinos = {"Rio", "São Paulo", "São Paulo"};

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Consultar");
            System.out.println("2 - Reservar");
            System.out.println("3 - Sair");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Número do voo: ");
                int numero = sc.nextInt();
                boolean encontrado = false;

                for (int i = 0; i < voos.length; i++) {
                    if (voos[i] == numero) {
                        System.out.println("Voo " + voos[i] + ": " + origens[i] + " -> " + destinos[i] + " | Lugares disponíveis: " + lugares[i]);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Voo não encontrado.");
                }

            } else if (opcao == 2) {
                System.out.print("Número do voo para reserva: ");
                int numeroVoo = sc.nextInt();
                boolean reservado = false;

                for (int i = 0; i < voos.length; i++) {
                    if (voos[i] == numeroVoo) {
                        if (lugares[i] > 0) {
                            lugares[i]--;
                            System.out.println("Reserva confirmada!");
                        } else {
                            System.out.println("Voo lotado.");
                        }
                        reservado = true;
                        break;
                    }
                }

                if (!reservado) {
                    System.out.println("Voo não encontrado.");
                }

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
	}

}
