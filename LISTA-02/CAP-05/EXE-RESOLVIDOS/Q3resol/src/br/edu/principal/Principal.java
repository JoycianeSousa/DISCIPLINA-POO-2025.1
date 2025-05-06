package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite o %dº número inteiro e positivo: ", i);
            int num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Número inválido! Fatorial só é definido para inteiros não-negativos.");
                continue; 
            }

            long fatorial = 1;

            for (int j = 1; j <= num; j++) {
                fatorial *= j;
            }

            System.out.printf("Número: %d | Fatorial: %d%n", num, fatorial);
        }


	}

}
