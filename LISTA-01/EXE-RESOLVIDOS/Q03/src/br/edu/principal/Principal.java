package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        double nota1, nota2, nota3, peso1, peso2, peso3, mediaPonderada;

       
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        peso1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        peso2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        peso3 = scanner.nextDouble();

       
        mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

       
        System.out.println("A média ponderada é: " + mediaPonderada);

        
        scanner.close();
    }
}

