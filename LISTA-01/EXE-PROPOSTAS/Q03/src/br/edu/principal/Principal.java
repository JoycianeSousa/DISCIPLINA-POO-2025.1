package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		Double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero(mais não pode ser 0): ");
		Double num2 = sc.nextDouble();
		
		System.out.println("Resultado da divisão é:" + (num1 / num2));
		
		sc.close();
	}

}
