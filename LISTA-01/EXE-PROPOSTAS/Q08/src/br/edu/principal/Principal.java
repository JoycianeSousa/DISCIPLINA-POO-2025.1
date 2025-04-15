package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso em quilos: ");
		Double pesoQuilos= sc.nextDouble();
		
		Double pesoGramas = pesoQuilos * 1000;
		
		System.out.println("Peso em gramas:" + pesoGramas);
		
		sc.close();

	}

}
