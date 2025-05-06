package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Digite um número entre 1 e 9: ");
        n = scanner.nextInt();

        if (n >= 1 && n <= 9) {
            mostrarTabuada(n);
        } else {
            System.out.println("Número fora do intervalo permitido (1 a 9).");
        }

        scanner.close();
    }

    public static void mostrarTabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}
