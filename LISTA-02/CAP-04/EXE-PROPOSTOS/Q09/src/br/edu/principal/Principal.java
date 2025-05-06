package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner Scanner = new Scanner (System.in);
	
    System.out.print("DIGITE A BASE MAIOR DO TRAPÉZIO: ");
    double baseMaior = Scanner.nextDouble();

    
    System.out.print("DIGITE A BASE MENOR DO TRAPÉZIO: ");
    double baseMenor = Scanner.nextDouble();

    
    System.out.print("DIGITE A ALTURA DO TRAPÉZIO: ");
    double altura = Scanner.nextDouble();

   
    double area = ((baseMaior + baseMenor) * altura) / 2;

    
    System.out.println("A ÁREA DO TRAPÉZIO É: " + String.format("%.2f", area));

    
    Scanner.close();
}
}
