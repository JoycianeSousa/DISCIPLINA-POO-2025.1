package br.edu.principal;
import java.util.Arrays;
import java.util.Collections;
public class Principal {

	public static void main(String[] args) {
        Integer[] numeros = {3, 5, 4, 2, 1, 6, 8, 7, 11, 9};

        System.out.println("Original:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("\nOrdenado (decrescente):");
        for (int numero : numeros) {
            System.out.println(numero);
        }


	}

}
