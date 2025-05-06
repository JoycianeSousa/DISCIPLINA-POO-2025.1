package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 int[] X = {3, 8, 4, 2, 1, 6, 8, 7, 11, 9};
	        int[] Y = {2, 1, 5, 12, 3, 0, 1, 4, 5, 6};
	        int[] U = new int[20]; 
	        int[] D = new int[10]; 
	        int[] S = new int[10];
	        int[] P = new int[10];
	        int[] IT = new int[10]; 

	        int contU = 0, contD = 0, contI = 0;

	       
	        for (int i = 0; i < 10; i++) {
	            boolean existe = false;
	            for (int j = 0; j < contU; j++) {
	                if (X[i] == U[j]) {
	                    existe = true;
	                    break;
	                }
	            }
	            if (!existe) {
	                U[contU++] = X[i];
	            }
	        }

	        
	        for (int i = 0; i < 10; i++) {
	            boolean existe = false;
	            for (int j = 0; j < contU; j++) {
	                if (Y[i] == U[j]) {
	                    existe = true;
	                    break;
	                }
	            }
	            if (!existe) {
	                U[contU++] = Y[i];
	            }
	        }

	        
	        for (int i = 0; i < 10; i++) {
	            boolean existeEmY = false;
	            for (int j = 0; j < 10; j++) {
	                if (X[i] == Y[j]) {
	                    existeEmY = true;
	                    break;
	                }
	            }
	            if (!existeEmY) {
	                boolean jaAdicionado = false;
	                for (int k = 0; k < contD; k++) {
	                    if (D[k] == X[i]) {
	                        jaAdicionado = true;
	                        break;
	                    }
	                }
	                if (!jaAdicionado) {
	                    D[contD++] = X[i];
	                }
	            }
	        }

	        
	        for (int i = 0; i < 10; i++) {
	            S[i] = X[i] + Y[i];
	            P[i] = X[i] * Y[i];
	        }

	        
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                if (X[i] == Y[j]) {
	                    boolean jaExiste = false;
	                    for (int k = 0; k < contI; k++) {
	                        if (IT[k] == X[i]) {
	                            jaExiste = true;
	                            break;
	                        }
	                    }
	                    if (!jaExiste) {
	                        IT[contI++] = X[i];
	                    }
	                    break;
	                }
	            }
	        }

	        
	        System.out.print("X:         ");
	        imprimirVetor(X, 10);

	        System.out.print("Y:         ");
	        imprimirVetor(Y, 10);

	        System.out.print("União:     ");
	        imprimirVetor(U, contU);

	        System.out.print("Diferença: ");
	        imprimirVetor(D, contD);

	        System.out.print("Soma:      ");
	        imprimirVetor(S, 10);

	        System.out.print("Produto:   ");
	        imprimirVetor(P, 10);

	        System.out.print("Interseção:");
	        imprimirVetor(IT, contI);
	    }

	    public static void imprimirVetor(int[] vetor, int tamanho) {
	        for (int i = 0; i < tamanho; i++) {
	            System.out.print(vetor[i] + " ");
	        }
	        System.out.println();
	    }
		

	}


