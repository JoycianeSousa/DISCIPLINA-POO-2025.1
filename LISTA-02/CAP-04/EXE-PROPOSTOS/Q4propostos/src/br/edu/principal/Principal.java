package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        
	        System.out.print("Digite o primeiro número: ");
	        double num1 = input.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double num2 = input.nextDouble();

	        System.out.print("Digite o terceiro número: ");
	        double num3 = input.nextDouble();

	       
	        double maior;

	        if (num1 >= num2 && num1 >= num3) {
	            maior = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            maior = num2;
	        } else {
	            maior = num3;
	        }
	        System.out.println("O maior número é: " + maior);

	}

}
