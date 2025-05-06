package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		int numTermos;
		double x;
		
		System.out.print("digite um numero de termos: ");
		numTermos = Scanner.nextInt();
		
		System.out.print("digite o valor de X com numeros positivos:  ");
		x = Scanner.nextDouble();
		
		double s = 0;
		int denominador = 1;
		int direcao = 1;
		
		for (int i = 1; i <= numTermos; i++ ) {
			long fatorial =1;
			for (int j = 1; j <= denominador; j++) {
				fatorial *= j;
			}
			int expoente = i + 1;
            double termo = Math.pow(x, expoente) / fatorial;

            
            if (expoente % 2 == 0) {
                s -= termo;
            } else {
                s += termo;
            }

            
            if (denominador == 4) {
                direcao = -1;
            } else if (denominador == 1) {
                direcao = 1; 
            }

            denominador += direcao;
        }

        System.out.printf("O valor de S é: %.5f%n", s);
			}
		};
		
		
	


