package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		Double salario = sc.nextDouble();
		
		System.out.println("Digite o valor das vendas: ");
		Double vendas = sc.nextDouble();
		
		Double comissao= vendas * 0.04;
		System.out.println("Comissao:" + comissao);
		System.out.println("Salário Final:" + (salario + comissao));
		
		sc.close();

	}

}
