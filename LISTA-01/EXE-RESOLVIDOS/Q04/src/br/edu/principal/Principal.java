package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

       
        double salario, novoSalario;

        
        System.out.print("Digite o salário atual do funcionário: ");
        salario = scanner.nextDouble();

        
        novoSalario = salario * 1.25;

       
        System.out.println("O novo salário com aumento de 25% é: " + novoSalario);

        
        scanner.close();
    }
}

