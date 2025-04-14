package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preco do produto: ");
		Double preco= sc.nextDouble();
		
		Double novoPreco = preco * 0.90;
		
		System.out.println("Produto com 10% de desconto: " +  novoPreco);
		
		sc.close();
		}

}
