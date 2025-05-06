package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        final int TAM = 8;

	        int[] num = new int[TAM];
	        int[] pos = new int[TAM];  
	        int[] neg = new int[TAM]; 
	        int cont_p = 0;
	        int cont_n = 0;

	        
	        for (int i = 0; i < TAM; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            num[i] = scanner.nextInt();

	            if (num[i] >= 0) {
	                pos[cont_p] = num[i];
	                cont_p++;
	            } else {
	                neg[cont_n] = num[i];
	                cont_n++;
	            }
	        }

	        
	        if (cont_n == 0) {
	            System.out.println("\nVetor de negativos vazio.");
	        } else {
	            System.out.println("\nVetor de números negativos:");
	            for (int i = 0; i < cont_n; i++) {
	                System.out.print(neg[i] + " ");
	            }
	        }

	        if (cont_p == 0) {
	            System.out.println("\nVetor de positivos vazio.");
	        } else {
	            System.out.println("\n\nVetor de números positivos:");
	            for (int i = 0; i < cont_p; i++) {
	                System.out.print(pos[i] + " ");
	            }
	        }

	}

}
