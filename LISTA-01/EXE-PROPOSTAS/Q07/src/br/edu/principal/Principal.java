package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso atual: ");
		Double peso= sc.nextDouble();
		
		Double pesoEngordar= peso * 1.25;
		Double pesoEmagrecer= peso * 0.80;
		
		System.out.println("Se engordar 15%, o novo peso será: " + pesoEngordar);
		System.out.println("Se emagrecer 20%,  o novo peso será:" + pesoEmagrecer);
		
		sc.close();
		
	}

}
