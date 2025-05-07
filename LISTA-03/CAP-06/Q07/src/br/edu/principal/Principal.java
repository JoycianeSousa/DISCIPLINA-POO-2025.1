package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            int novoNumero = scanner.nextInt();

            int j = i;
            while (j > 0 && numeros[j - 1] > novoNumero) {
                numeros[j] = numeros[j - 1];
                j--;
            }

            numeros[j] = novoNumero;
        }

        System.out.println("\nNúmeros em ordem crescente:");
        for (int i = 0; i < 8; i++) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
	}

}
