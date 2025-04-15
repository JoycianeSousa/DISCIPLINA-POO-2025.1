package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base maior: ");
		Double baseMaior = sc.nextDouble();
		
		System.out.println("Digite a base menor: ");
		Double baseMenor= sc.nextDouble();
		
		System.out.println("Digite a altura: ");
		Double altura= sc.nextDouble();
		
		Double area=((baseMaior + baseMenor) * altura)/2;
		System.out.println("Á rea do trapézio:" + area);
		
		sc.close();
	}

}
