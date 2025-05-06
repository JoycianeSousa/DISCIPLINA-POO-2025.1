package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] num = new int[9];

        
        for (int i = 0; i < 9; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            num[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros primos e suas posições:");
        
        for (int i = 0; i < 9; i++) {
            int cont = 0;
            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    cont++;
                }
            }
            
            if (cont == 2) {
                System.out.println("Número primo: " + num[i] + " na posição: " + i);
            }
        }

	}

}
