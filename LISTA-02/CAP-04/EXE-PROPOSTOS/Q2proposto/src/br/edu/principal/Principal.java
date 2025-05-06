package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        
	        System.out.print("Digite a primeira nota: ");
	        double nota1 = input.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = input.nextDouble();

	        
	        double media = (nota1 + nota2) / 2;

	        
	        System.out.printf("Média: %.2f%n", media);

	       
	        if (media >= 0 && media < 3) {
	            System.out.println("Situação: Reprovado");
	        } else if (media >= 3 && media < 7) {
	            System.out.println("Situação: Exame");
	        } else if (media >= 7 && media <= 10) {
	            System.out.println("Situação: Aprovado");
	        } else {
	            System.out.println("Média inválida! Verifique as notas inseridas.");
	        }

	}

}
