package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static double calcularMedia(double nota1, double nota2, double nota3, char tipoMedia) {
        if (tipoMedia == 'A' || tipoMedia == 'a') {
            return (nota1 + nota2 + nota3) / 3;
        } else if (tipoMedia == 'P' || tipoMedia == 'p') {
            return (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
        } else {
            System.out.println("Tipo de média inválido. Use 'A' para aritmética ou 'P' para ponderada.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
        char tipoMedia = scanner.next().charAt(0);

        double media = calcularMedia(nota1, nota2, nota3, tipoMedia);

                if (media != -1) {
            System.out.printf("A média calculada é: %.2f\n", media);
        }

        scanner.close();
    }
}
