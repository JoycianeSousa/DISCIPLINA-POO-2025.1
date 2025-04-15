package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Digite a base do triangulo: ");
		double base = Scanner.nextDouble();
		
		System.out.print("Digite a altura do triangulo: ");
		double altura = Scanner.nextDouble();
		
		       
		double areaTriangulo = (base * altura) / 2;
		
		System.out.print("a area do triangulo é: " + areaTriangulo);
		
		Scanner.close();


	}

}