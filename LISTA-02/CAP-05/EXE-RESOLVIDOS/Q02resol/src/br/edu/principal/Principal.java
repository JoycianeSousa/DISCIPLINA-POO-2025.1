package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media, nota_exame;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média aritmética: "+ media + ",");

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Exame");
            nota_exame = 12 - media;
            System.out.printf("Deve tirar nota %.2f para ser aprovado\n", nota_exame);
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Média inválida");
        }


	}

}
