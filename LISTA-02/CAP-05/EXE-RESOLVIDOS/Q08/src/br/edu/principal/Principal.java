package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
			
			
			        Scanner scanner = new Scanner(System.in);

			        System.out.print("Digite o número de termos: ");
			        int numTermos = scanner.nextInt();

			        int num1 = 2, num2 = 7, num3 = 3;
			        int i = 1;

			        while (i <= numTermos) {
			            if (i % 3 == 1) { 
			                System.out.print(num1 + " ");
			                num1 *= 2;
			            } else if (i % 3 == 2) { 
			                System.out.print(num2 + " ");
			                num2 *= 3;
			            } else { 
			                System.out.print(num3 + " ");
			                num3 *= 4;
			            }
			            i++;
			        }

	}

}
