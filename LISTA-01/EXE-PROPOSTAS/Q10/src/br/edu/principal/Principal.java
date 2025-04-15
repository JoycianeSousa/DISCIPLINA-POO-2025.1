package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado:");
		Double lado= sc.nextDouble();
		
		Double area =lado * lado;
		
		System.out.println("Area do losango :" + area );
		
		sc.close();

	}

}
