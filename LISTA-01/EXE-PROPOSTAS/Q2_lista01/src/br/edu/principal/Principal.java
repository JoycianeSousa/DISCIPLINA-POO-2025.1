package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1= sc.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2= sc.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		double num3= sc.nextDouble();
		
		System.out.println("Resultado da multiplicação:" + (num1 * num2 * num3));
		
		sc.close();	
	}

}
