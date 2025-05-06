package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double valorAntigo, valorAtual;

        System.out.print("Digite o valor antigo do produto: ");
        valorAntigo = scanner.nextDouble();

        System.out.print("Digite o valor atual do produto: ");
        valorAtual = scanner.nextDouble();

        double percentual = calcularAcrescimo(valorAntigo, valorAtual);

        System.out.printf("O percentual de acréscimo foi de: %.2f%%%n", percentual);

        scanner.close();
    }

    public static double calcularAcrescimo(double antigo, double atual) {
        if (antigo == 0) {
            return 0;         }
        return ((atual - antigo) / antigo) * 100;
    }
}
