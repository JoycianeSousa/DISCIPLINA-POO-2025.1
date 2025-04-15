package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
       Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do deposito: ");
		double deposito = Scanner.nextDouble();
		
		System.out.print("Digite a taxa de juros (%): ");
		double taxa = Scanner.nextDouble();

		
		double rendimento = deposito * (taxa / 100);
		double total = deposito + rendimento; 
		
		System.out.println("Rendimento: " + rendimento);
		System.out.println("Total após rendimento: " + total);
		
		Scanner.close();


	}

}