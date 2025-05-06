package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    
    System.out.print("DIGITE O VALOR DO LADO DO QUADRADO: ");
    double lado = Scanner.nextDouble();

    
    double area = lado * lado;

    
    System.out.println("A ÁREA DO QUADRADO É: " + String.format("%.2f", area));

    
    Scanner.close();
}
}
