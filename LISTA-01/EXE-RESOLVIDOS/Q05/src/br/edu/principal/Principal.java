package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        double salario, percentualAumento, aumento, novoSalario;

       
        System.out.print("Digite o salário atual do funcionário: ");
        salario = scanner.nextDouble();

       
        System.out.print("Digite o percentual de aumento: ");
        percentualAumento = scanner.nextDouble();

        
        aumento = salario * (percentualAumento / 100);

       
        novoSalario = salario + aumento;

       
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        
        scanner.close();
    }
}