package br.edu.principal;
import java.util.Scanner;
public class Principal {

	
 public static int somar(int num1, int num2) {
	    int s = 0;
 int inicio = Math.min(num1, num2);
	   int fim = Math.max(num1, num2);

	   for (int i = inicio + 1; i < fim; i++) {
	            s += i;
	        }

	        return s;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int num2 = scanner.nextInt();

	        int s = somar(num1, num2);
	        System.out.println("soma = " + s);

	        scanner.close();
	    }
	}
	