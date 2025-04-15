package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Digite o salário base: ");
		double salário = Scanner.nextDouble();
		
		
		double imposto = salário * 10 / 100;
		double salárioReceber = salário + 50 - imposto;
		
		System.out.println("Salário a receber: " + salárioReceber);
		
		Scanner.close();



	}

}