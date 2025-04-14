package br.edu.principal;
 import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		Double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero:");
		Double num2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro numero:");
		Double num3 = sc.nextDouble();
		
		System.out.println("A multiplicação dos numeros é:" + (num1 * num2 * num3 ));
	}

}
