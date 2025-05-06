package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int numero, maior, menor;

        System.out.print("Digite o 1º número: ");
        numero = scanner.nextInt();
        maior = numero;
        menor = numero;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}
