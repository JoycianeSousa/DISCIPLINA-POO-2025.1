package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner Scanner = new Scanner(System.in);
		
		
	    System.out.print("DIGITE O SALÁRIO FIXO DO FUNCIONÁRIO: R$ ");
        double salarioFixo = Scanner.nextDouble();
        
        System.out.print("DIGITE O VALOR DAS VENDAS REALIZADAS PELO FUNCIONÁRIO: R$ ");
        double vendas = Scanner.nextDouble();
        
        double comissao = vendas * 0.04;
        double salarioFinal = salarioFixo + comissao;
        
      
        System.out.println("\nCOMISSÃO: R$ " + String.format("%.2f", comissao));
        System.out.println("SALÁRIO FINAL: R$ " + String.format("%.2f", salarioFinal));
        
         
      
        Scanner.close();
    }
}
