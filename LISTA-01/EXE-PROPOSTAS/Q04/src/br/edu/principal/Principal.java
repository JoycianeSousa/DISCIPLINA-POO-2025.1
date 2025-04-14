package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primera nota: ");
		Double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		Double nota2 = sc.nextDouble();
		
		System.out.println("Sua média é:" + (nota1*2 + nota2 * 3) /5);
		
		sc.close();
	}

}
