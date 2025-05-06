package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        int anoAtual;
	        double salario = 1000.0;
	        double percentual = 1.5 / 100;
	        double novoSalario;

	        
	        System.out.print("Informe o ano atual: ");
	        anoAtual = scanner.nextInt();

	      
	        novoSalario = salario + (percentual * salario);

	       
	        for (int i = 2007; i <= anoAtual; i++) {
	            percentual = percentual * 2; 
	            novoSalario = novoSalario + (percentual * novoSalario); 
	        }

	        
	        System.out.printf("O salário atual em %d é: R$ %.2f\n", anoAtual, novoSalario);
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Informe o ano atual: ");
	        anoAtual = scanner.nextInt();

	        
	        novoSalario = salario + (percentual * salario);

	        
	        for (int i = 2007; i <= anoAtual; i++) {
	            percentual = percentual * 2; 
	            novoSalario = novoSalario + (percentual * novoSalario); 
	        }

	        
	        System.out.printf("O salário atual em %d é: R$ %.2f\n", anoAtual, novoSalario);


	}

}
