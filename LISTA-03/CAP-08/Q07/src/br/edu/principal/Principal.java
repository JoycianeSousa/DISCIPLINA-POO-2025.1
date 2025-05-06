package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner Scanner = new Scanner (System.in);
    
    
    System.out.print("DIGITE O PESO DA PESSOA (em kg): ");
    double peso = Scanner.nextDouble();
    
    double pesoEngordar = peso * 1.15;
    
        double pesoEmagrecer = peso * 0.80;
    
    
    System.out.println("\nSE A PESSOA ENGORDAR 15%: " + String.format("%.2f", pesoEngordar) + " kg");
    System.out.println("SE A PESSOA EMAGRECER 20%: " + String.format("%.2f", pesoEmagrecer) + " kg");
    
    
    Scanner.close();
}
}
