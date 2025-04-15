package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Digite o salário base: ");
		double salário = Scanner.nextDouble();
		
		double gratificaçao = salário *5 / 100;
		double imposto = salário * 7 / 100;
		double salárioReceber = salário + gratificaçao - imposto;
		
		System.out.println("Salário a receber: " + salárioReceber);
		
		Scanner.close();

	}

}