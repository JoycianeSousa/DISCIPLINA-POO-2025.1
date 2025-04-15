package br.edu.principal;
import java.util.Scanner;

	public class Principal {
		    public static void main(String[] args) {
		   
		    	Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o primeiro número: ");
		        double numero1 = scanner.nextDouble();
		        double numero2 = scanner.nextDouble();
		        double numero3 = scanner.nextDouble();

		        
		        System.out.println("Resultado da multiplicaçao: " + (numero1 * numero2 *  numero3));

		        scanner.close();
		    }
		}
    	
   
	 